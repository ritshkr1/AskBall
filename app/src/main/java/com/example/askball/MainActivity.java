package com.example.askball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button askButton = findViewById(R.id.buttonask);
        final ImageView diceImage = findViewById(R.id.ballArray);

        final int[] ballArray = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,};

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumber= new Random();
                int number= randomNumber.nextInt(5);
                diceImage.setImageResource(ballArray[number]);
            }
        });
    }
}