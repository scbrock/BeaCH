package com.example.stephenbrock.trial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reborn1 extends AppCompatActivity {

    public Button butNext;

    public void init() {
        butNext = (Button)findViewById(R.id.butNext);

        butNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i_1 = new Intent(Reborn1.this, lowerSelection.class);
                startActivity(i_1);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reborn1);
        init();
    }
}
