package com.example.parthpathak.androidtextrecognition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
Button scan, b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        scan=findViewById(R.id.button1);

        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Main = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(Main);
            }
        });

b2=findViewById(R.id.button2);
b2.setText(MainActivity.textScaned);

    }
}