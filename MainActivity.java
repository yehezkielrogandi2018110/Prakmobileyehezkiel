package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void biodata(View view) {
        Intent a = new Intent(MainActivity.this,
                Biodata.class);
        startActivity(a);


    }

    public void Segitiga(View view) {
        Intent b = new Intent(MainActivity.this,
                Segitiga.class);
        startActivity(b);
    }
}