package com.example.dr.myapplication;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
 private TextView ty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO adsfjasdjfk
       ty= (TextView) findViewById(R.id.dd);
        ty.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ty.setTextSize(50);
    }
}
