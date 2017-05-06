package com.example.stephenbrock.trial;

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
    public Button but8;

        public void init() {
            but1 = (Button)findViewById(R.id.but1);

            but1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent i_1 = new Intent(Main.this, Second.class);
                    startActivity(i_1);
                }
            });

        }

        public void init2(){
            but2 = (Button)findViewById(R.id.but2);

            but2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent i_2 = new Intent(Main.this, Third.class);
                    startActivity(i_2);
                }
            });
        }

        public void init3() {
            but3 = (Button)findViewById(R.id.but3);

            but3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i_3 = new Intent(Main.this, Calendar.class);
                    startActivity(i_3);
                }
            });
        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        init2();
        init3();
    }
}
