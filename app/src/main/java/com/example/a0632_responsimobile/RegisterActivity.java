package com.example.a0632_responsimobile;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.a0632_responsimobile.room.AppDatabase;
import com.example.a0632_responsimobile.room.Responsi;

public class RegisterActivity extends AppCompatActivity {
    private Button btnRegis;
    private EditText etMail, etPass, etKonfirm;

    AppDatabase db;
    Responsi responsi;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnRegis = findViewById(R.id.btnRegis);
        etMail = findViewById(R.id.etMail);
        etPass = findViewById(R.id.etPass);
        etKonfirm = findViewById(R.id.etKonfirm);

        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = etMail.getText().toString().trim();
                String password = etPass.getText().toString().trim();
                String konfirm = etKonfirm.getText().toString().trim();

                if (password.equals(konfirm)) {
                    db = AppDatabase.getDbInstance(getApplicationContext());
                    db.userDao().insertAll(responsi);
                    startActivity(new Intent(RegisterActivity.this, MainActivity.class));
                } else {
                    Toast.makeText(getApplicationContext(), "Mohon Masukkan dengan Benar", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}