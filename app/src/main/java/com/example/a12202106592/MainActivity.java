package com.example.a12202106592;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pilihchoco(View view) {
        Intent intent = new Intent(MainActivity.this,Choco.class);
        startActivity(intent);
    }

    public void pilihmilo(View view) {
        Intent intent = new Intent(MainActivity.this,Milo.class);
        startActivity(intent);
    }

    public void pilihmilk(View view) {
        Intent intent = new Intent(MainActivity.this,Milk.class);
        startActivity(intent);
    }

    public void pilihredvelvet(View view) {
        Intent intent = new Intent(MainActivity.this,redvelvet.class);
        startActivity(intent);
    }

    public void pilihtaro(View view) {
        Intent intent = new Intent(MainActivity.this,taro.class);
        startActivity(intent);
    }

    public void pilihmatha(View view) {
        Intent intent = new Intent(MainActivity.this,matcha.class);
        startActivity(intent);
    }

    public void pilihsandwich(View view) {
        Intent intent = new Intent(MainActivity.this,sandwich.class);
        startActivity(intent);
    }

    public void pilihbeef(View view) {
        Intent intent = new Intent(MainActivity.this,beef.class);
        startActivity(intent);
    }

    public void pilihbakarcoklat(View view) {
        Intent intent = new Intent(MainActivity.this,bakarcoklat.class);
        startActivity(intent);
    }

    public void pilihbakarkeju(View view) {
        Intent intent = new Intent(MainActivity.this,bakarkeju.class);
        startActivity(intent);
    }
}