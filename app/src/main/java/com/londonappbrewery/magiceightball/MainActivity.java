package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] myArray= {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5 };
        Button askButton;
        askButton= findViewById(R.id.Ask_button);

        final ImageView decision = findViewById(R.id.imageView2);

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random generator =new Random();
                int myNumber = generator.nextInt(5);

                decision.setImageResource(myArray[myNumber]);

                Log.d("tag_name","button clicked");
            }
        });

        }
    }

