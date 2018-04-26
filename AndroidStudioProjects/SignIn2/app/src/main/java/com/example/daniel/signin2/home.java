package com.example.daniel.signin2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;


// daniel ws here
public class home extends AppCompatActivity {
    private CardView catalogCard;
    private CardView chatCard;
    private CardView upImgCard;
    private CardView calCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        catalogCard=(CardView)findViewById(R.id.catalog);
        chatCard=(CardView)findViewById(R.id.chatBoard);
        upImgCard=(CardView)findViewById(R.id.uploadImg);
        calCard=(CardView)findViewById(R.id.calendar);

         catalogCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),catalog.class));
            }
        });

        chatCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),catalog.class));
            }
        });

        upImgCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),catalog.class));
            }
        });

        calCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),catalog.class));
            }
        });
    }
}

