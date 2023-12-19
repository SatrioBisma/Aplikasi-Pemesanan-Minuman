package com.example.a12202106592;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

import static android.R.string.no;
import static android.os.Build.VERSION_CODES.N;

public class Choco extends AppCompatActivity {
    TextView textView ;
    TextView textView2;
    int totharga;
    int konter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choco);
        textView = findViewById(R.id.kuantitas);
        textView2 = findViewById(R.id.totalharga);
    }
    //perintah tombol tambah
    public void plus(View view){
       konter++;
       textView.setText(Integer.toString(konter));
       totharga += 25000;
       textView2.setText(Integer.toString(totharga));
    }
    //perintah tombol kurang
    public void min(View view){
        konter--;
        textView.setText(Integer.toString(konter));
        totharga -= 25000;
        textView2.setText(Integer.toString(totharga));
    }
}