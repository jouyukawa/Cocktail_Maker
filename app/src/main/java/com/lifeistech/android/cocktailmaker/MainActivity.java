package com.lifeistech.android.cocktailmaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton tequila;
    private ImageButton gin;
    private ImageButton rum;
    private ImageButton vodka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //イメージボタンを設定
        tequila = (ImageButton)findViewById(R.id.tequila);






    }
}
