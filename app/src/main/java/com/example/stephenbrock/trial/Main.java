package com.example.stephenbrock.trial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Main extends AppCompatActivity {

    public Button but1;

        public void init() {
            but1 = (Button)findViewById(R.id.but1);
            but1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent toy = new Intent(Main.this, Second.class);
                    startActivity(toy);
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
