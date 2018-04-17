package cn.nurasoft.zero.VBNet;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by miro on 13/02/17~.~
 **/

public class DataBaseHelperClass extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Vbnet.db3";
    private static final int DATABASE_VERSION = 1;
    private static String DB_PATH = "";
    private static SQLiteDatabase sqLiteDatabase;
    private Context context;
    private String arg[] = new String[6];

    DataBaseHelperClass(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        DB_PATH = "/data/data/" + context.getPackageName() + "/";
        this.context = context;
    }

    void createDataBase() throws IOException {
        boolean databasesExist = checkDataBase();
        if (!databasesExist) {
            this.getReadableDatabase();
            this.close();
            try {
                copyDataBase();
                String TAG = "ZERO REFERENCES:";
                Log.e(TAG, "Created successfully!");
            } catch (IOException me) {
                throw new Error("Has some errors while copying databases!");
            }
        }
    }

    private boolean checkDataBase() {
        File databaseFile = new File(DB_PATH + DATABASE_NAME);
        Log.v("database exists!", databaseFile + "   " + databaseFile.exists());
        return databaseFile.exists();
    }

    private void copyDataBase() throws IOException {
        InputStream myInput = context.getAssets().open(DATABASE_NAME);

        String outFileName = DB_PATH + DATABASE_NAME;


        OutputStream myOutput = new FileOutputStream(outFileName);


        byte[] buffer = new byte[1024];
        int length;
        while ((length = myInput.read(buffer)) > 0) {
            myOutput.write(buffer, 0, length);
        }
        myOutput.flush();
        myOutput.close();
        myInput.close();
    }

    void openDataBase() throws SQLException {
        String myPath = DB_PATH + DATABASE_NAME;
        sqLiteDatabase = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READWRITE);
    }

    @Override
    public synchronized void close() {
        if (sqLiteDatabase != null)
            sqLiteDatabase.close();
        super.close();
    }

    String[] Get_Function(String CName) {
        arg[0] = null;
        arg[1] = null;
        arg[2] = null;
        arg[3] = null;
        arg[4] = null;
        arg[5] = null;
        String query = "select * from functions where name='" + CName + "'";

        Cursor cursor = sqLiteDatabase.rawQuery(query, null);
        if (cursor.getCount() > 0) {
            if (cursor.moveToFirst()) {
                do {
                    arg[0] = cursor.getString(0);
                    arg[1] = cursor.getString(1);
                    arg[2] = cursor.getString(2);
                    arg[3] = cursor.getString(3);
                    arg[4] = cursor.getString(4);
                    arg[5] = cursor.getString(5);
                }
                while (cursor.moveToNext());
            }
            cursor.close();
        }
        return arg;
    }

    byte[] get_File(String subText) {
        byte[] bytes = null;

        String query = "Select FileName from sub where SubText='" + subText + "'";
        Cursor cursor = sqLiteDatabase.rawQuery(query, null);
        if (cursor.getCount() > 0) {

            if (cursor.moveToFirst()) {
                do {
                    bytes = cursor.getBlob(0);
                } while (cursor.moveToNext());
            }
            cursor.close();
        }
        return bytes;
    }

    String get_namespaces(String name) {
        String result = null;
        String query = "select description from namespaces where name='" + name + "'";
        Cursor cursor = sqLiteDatabase.rawQuery(query, null);
        if (cursor.getCount() > 0) {
            if (cursor.moveToFirst()) {
                do {
                    result = cursor.getString(0);
                }
                while (cursor.moveToNext());
            }
            cursor.close();
        }
        return result;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int ii) {
        if (ii > i)
            try {
                copyDataBase();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
