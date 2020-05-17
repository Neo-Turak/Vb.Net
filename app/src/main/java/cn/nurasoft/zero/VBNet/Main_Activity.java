package cn.nurasoft.zero.VBNet;


import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class Main_Activity extends AppCompatActivity {

    ImageView im1, im2, im3, im4, im5, im6;
    TextView version;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        im1 = findViewById(R.id.image1);
        im2 = findViewById(R.id.image2);
        im3 = findViewById(R.id.image3);
        im4 = findViewById(R.id.image4);
        im5 = findViewById(R.id.image5);
        im6 = findViewById(R.id.image6);

        version=findViewById(R.id.version);
        String v;
        try {
            PackageInfo pinfo=this.getPackageManager().getPackageInfo(this.getPackageName(),0);
            v=pinfo.versionName;
            version.setText("Version:"+v);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Main_Activity.this, Functions_List_Activity.class);
                Main_Activity.this.startActivity(intent);


            }
        });
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Main_Activity.this, Tutorial_List_Activity.class);
                Main_Activity.this.startActivity(intent);


            }
        });
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Main_Activity.this, Namespaces_Activity.class);
                Main_Activity.this.startActivity(intent);
            }
        });
        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Main_Activity.this, Settings_Activity.class);
                Main_Activity.this.startActivity(intent);
            }
        });

        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Main_Activity.this, Key_words_Activity.class);
                Main_Activity.this.startActivity(intent);
            }
        });

        im6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(Main_Activity.this,About_Me_Activity.class);
                startActivity(intent);
            }
        });
    }

}
