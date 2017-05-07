package com.example.stephenbrock.trial;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Second extends AppCompatActivity {

    public Button butNext;

    public void init() {
        butNext = (Button)findViewById(R.id.butNext);

        butNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i_1 = new Intent(Second.this, upperSelection.class);
                startActivity(i_1);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        init();
    }
}
