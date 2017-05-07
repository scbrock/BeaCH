package com.example.stephenbrock.trial;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Main extends AppCompatActivity {

    public Button but1;
    public Button but2;
    public Button but3;
    public Button but4;
    public Button but5;
    public Button but6;
    public Button but7;
    public FloatingActionButton fab;


        public void init() {
            but1 = (Button)findViewById(R.id.but1);
            but2 = (Button)findViewById(R.id.but2);
            but3 = (Button)findViewById(R.id.but3);
            but4 = (Button)findViewById(R.id.but4);
            but5 = (Button)findViewById(R.id.but5);
            but6 = (Button)findViewById(R.id.but6);
            but7 = (Button)findViewById(R.id.but7);
            fab = (FloatingActionButton)findViewById(R.id.fab);

            but1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent i_1 = new Intent(Main.this, Second.class);
                    startActivity(i_1);
                }
            });

            but2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent i_2 = new Intent(Main.this, Reborn1.class);
                    startActivity(i_2);
                }
            });

            but3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent i_3 = new Intent(Main.this, Reborn2.class);
                    startActivity(i_3);
                }
            });

            but4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent i_4 = new Intent(Main.this, Reborn3.class);
                    startActivity(i_4);
                }
            });

            but5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent i_5 = new Intent(Main.this, Reborn4.class);
                    startActivity(i_5);
                }
            });

            but6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent i_6 = new Intent(Main.this, Reborn5.class);
                    startActivity(i_6);
                }
            });

            but7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent i_7 = new Intent(Main.this, Reborn6.class);
                    startActivity(i_7);
                }
            });

            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent i_8 = new Intent(Main.this, Calendar.class);
                    startActivity(i_8);
                }
            });

        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
}
