package com.example.mayank.tradex;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class Title_TradeX extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title__trade_x);

        new Handler().postDelayed (new Runnable() {
            @Override
            public void run() {
                Intent loadintent = new Intent(Title_TradeX.this, LoadScreenActivity.class);
                startActivity(loadintent);
                finish();
            }
        }, SPLASH_TIME_OUT);


    }

}
