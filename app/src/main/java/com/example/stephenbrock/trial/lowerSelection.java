package com.example.stephenbrock.trial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lowerSelection extends AppCompatActivity {

    public Button butEasy;
    public Button butMedium;
    public Button butHard;

    public void init() {
        butEasy = (Button)findViewById(R.id.butEasy);
        butMedium = (Button)findViewById(R.id.butMedium);
        butHard = (Button)findViewById(R.id.butHard);

        butEasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i_1 = new Intent(lowerSelection.this, lowerEasy.class);
                startActivity(i_1);
            }
        });

        butMedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i_2 = new Intent(lowerSelection.this, lowerMedium.class);
                startActivity(i_2);
            }
        });

        butHard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i_3 = new Intent(lowerSelection.this, lowerHard.class);
                startActivity(i_3);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lower_selection);
        init();
    }
}
