package cn.nurasoft.zero.VBNet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;


/**
 * Created by miro on 12/02/17~.~
 **/

public class Tutorial_List_Activity extends Activity {

    ImageButton _return;
    ListView listView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorial_list);

        _return = findViewById(R.id._return);

        _return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Tutorial_List_Activity.this, Main_Activity.class);
                Tutorial_List_Activity.this.startActivity(intent);
            }
        });
        final String[] tutorial = new String[]{"Base", "Overview", "Environment Setup", "Program structure", "basic Syntax", "Data Types", "Variables", "Constants",
                "Modifiers", "Statements", "Directives", "Operators", "Decision Making", "Loops", "Strings", "Date&Time", "Arrays", "Collections", "Functions", "Subs", "Classes & Objects",
                "Exception Handling", "File Handling", "Basic Controls", "Dialog Boxes", "Advanced Forms", "Event Handling", "Regular Expressions",
                "Database Access", "Excel Sheet", "Send Email", "XML Processing", "Web Programming", "Quick Guide", "Useful Resources"
        };

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tutorial);

        listView = findViewById(R.id.listview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), Tutorial_Activity.class);
                intent.putExtra("sub", adapterView.getItemAtPosition(i).toString());
                startActivity(intent);

            }
        });
    }


}
