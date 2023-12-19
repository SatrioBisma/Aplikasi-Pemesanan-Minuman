package com.example.a12202106592;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Milo extends AppCompatActivity {
    TextView textView ;
    TextView textView2;
    int totharga;
    int konter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milo);
        textView = findViewById(R.id.kuantitas);
        textView2 = findViewById(R.id.totalharga);
    }
    //perintah tombol tambah
    public void plus(View view){
        konter++;
        textView.setText(Integer.toString(konter));
        totharga += 28000;
        textView2.setText(Integer.toString(totharga));
    }
    //perintah tombol kurang
    public void min(View view){
        konter--;
        textView.setText(Integer.toString(konter));
        totharga -= 28000;
        textView2.setText(Integer.toString(totharga));
    }
}