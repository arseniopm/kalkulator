package com.example.kalkulator;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private TextView tvResult, tvNim, tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvResult = findViewById(R.id.tv_result);
        tvNim = findViewById(R.id.tv_nim);
        tvName = findViewById(R.id.tv_name);

        // Mendapatkan data dari intent
        double result = getIntent().getDoubleExtra("RESULT", 0);
        String nim = getIntent().getStringExtra("NIM");
        String name = getIntent().getStringExtra("NAME");

        // Menampilkan data
        tvResult.setText("Result: " + result);
        tvNim.setText("NIM: " + nim);
        tvName.setText("Name: " + name);
    }
}
