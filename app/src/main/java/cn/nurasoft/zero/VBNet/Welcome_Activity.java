package cn.nurasoft.zero.VBNet;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.Window;

import java.io.IOException;

import static android.content.ContentValues.TAG;

/**
 * Created by miro on 11/02/17~.~
 **/

public class Welcome_Activity extends Activity {

    cn.nurasoft.zero.VBNet.DataBaseHelperClass dbhelper;
    SQLiteDatabase db;
    private Handler handler;

    @SuppressLint("HandlerLeak")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        long start_time=System.currentTimeMillis();
        setTheme(R.style.StartTheme);

        Log.d(TAG,"Time===>"+(System.currentTimeMillis()-start_time));

        dbhelper = new cn.nurasoft.zero.VBNet.DataBaseHelperClass(this);
        db = dbhelper.getReadableDatabase();


        try {
            dbhelper.createDataBase();
            dbhelper.onUpgrade(db, 1, 2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //show the main activity
        final  Intent intent=new Intent();
        handler =  new Handler(){
            @Override
            public void handleMessage(Message msg){
                if(msg.what==1)
                intent.setClass(Welcome_Activity.this, cn.nurasoft.zero.VBNet.Main_Activity.class);
                Welcome_Activity.this.startActivity(intent);
            }
        };

        new Thread(new Runnable(){
            @Override
            public void run() {
                // TODO Auto-generated method stub
                try {
                    Thread.sleep(3000) ;
                } catch (Exception e) {
                    // TODO: handle exception
                }
                handler.sendEmptyMessage(1) ;
            }

        }).start() ;
    }

}
