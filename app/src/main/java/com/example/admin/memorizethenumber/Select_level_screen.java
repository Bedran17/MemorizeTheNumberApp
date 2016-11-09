package com.example.admin.memorizethenumber;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Select_level_screen extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_level_screen);

//      Level 1
        Button level1 = (Button) findViewById(R.id.start_level1_button);
        level1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Level1_screen.class);
                startActivityForResult(myIntent, 0);
            }
        });

//      Level 2
        Button level2 = (Button) findViewById(R.id.start_level2_button);
        level2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Level2_screen.class);
                startActivityForResult(myIntent, 0);
            }
        });

//      Back
        Button back = (Button) findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Start_screen.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
