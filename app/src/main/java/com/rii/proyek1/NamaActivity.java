package com.rii.proyek1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NamaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nama);

        //sintaks untuk mengubah title bar activity
        getSupportActionBar().setTitle("Aplikasi Mobile");

        Button btnTampil = findViewById(R.id.btn_tampilkan);
        EditText etNama = findViewById(R.id.et_nama);

        btnTampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(etNama.getText().toString())) {
                    Toast.makeText(NamaActivity.this, "Hai", Toast.LENGTH_SHORT).show();
                } else {
                    String nama = etNama.getText().toString();
                    Toast.makeText(NamaActivity.this, "Hai, " + nama, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}