package com.rii.proyek1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class KalkulatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        //sintaks untuk mengubah title bar activity
        getSupportActionBar().setTitle("Aplikasi Kalkulator");

        EditText etAngka1 = findViewById(R.id.et_angka1);
        EditText etAngka2 = findViewById(R.id.et_angka2);

        Button btnTambah = findViewById(R.id.btn_tambah);
        Button btnKurang = findViewById(R.id.btn_kurang);
        Button btnKali = findViewById(R.id.btn_kali);
        Button btnBagi = findViewById(R.id.btn_bagi);
        Button btnClear = findViewById(R.id.btn_clear);

        TextView tvHasil = findViewById(R.id.tv_hasil);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //validasi jika kedua angka tidak kosong
                if(!TextUtils.isEmpty(etAngka1.getText().toString()) && !TextUtils.isEmpty(etAngka2.getText().toString())) {
                    //ambil nilai edit teks
                    double angka1 = Double.parseDouble(etAngka1.getText().toString());
                    double angka2 = Double.parseDouble(etAngka2.getText().toString());

                    //lakukan operasi
                    double hasil = angka1 + angka2;
                    String textHasil = getString(R.string.tv_hasil, hasil);
                    tvHasil.setText(textHasil);
                }
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //validasi jika kedua angka tidak kosong
                if(!TextUtils.isEmpty(etAngka1.getText().toString()) && !TextUtils.isEmpty(etAngka2.getText().toString())) {
                    //ambil nilai edit teks
                    double angka1 = Double.parseDouble(etAngka1.getText().toString());
                    double angka2 = Double.parseDouble(etAngka2.getText().toString());

                    //lakukan operasi
                    double hasil = angka1 - angka2;
                    String textHasil = getString(R.string.tv_hasil, hasil);
                    tvHasil.setText(textHasil);
                }
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //validasi jika kedua angka tidak kosong
                if(!TextUtils.isEmpty(etAngka1.getText().toString()) && !TextUtils.isEmpty(etAngka2.getText().toString())) {
                    //ambil nilai edit teks
                    double angka1 = Double.parseDouble(etAngka1.getText().toString());
                    double angka2 = Double.parseDouble(etAngka2.getText().toString());

                    //lakukan operasi
                    double hasil = angka1 * angka2;
                    String textHasil = getString(R.string.tv_hasil, hasil);
                    tvHasil.setText(textHasil);
                }
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //validasi jika kedua angka tidak kosong
                if(!TextUtils.isEmpty(etAngka1.getText().toString()) && !TextUtils.isEmpty(etAngka2.getText().toString())) {
                    //ambil nilai edit teks
                    double angka1 = Double.parseDouble(etAngka1.getText().toString());
                    double angka2 = Double.parseDouble(etAngka2.getText().toString());

                    //lakukan operasi
                    double hasil = angka1 / angka2;
                    String textHasil = getString(R.string.tv_hasil, hasil);
                    tvHasil.setText(textHasil);
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etAngka1.setText("");
                etAngka1.requestFocus();
                etAngka2.setText("");
                tvHasil.setText("");
            }
        });

    }
}