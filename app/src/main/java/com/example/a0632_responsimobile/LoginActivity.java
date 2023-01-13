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

import java.util.List;

public class LoginActivity extends AppCompatActivity {
    private Button btnLogin;
    private EditText etMail2;
    private EditText etPass2;
    
    AppDatabase db;
    Responsi responsi;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        btnLogin = findViewById(R.id.btnLogin);
        etMail2 = findViewById(R.id.etMail2);
        etPass2 = findViewById(R.id.etPass2);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String eMail = etMail2.getText().toString().trim();
                String password = etPass2.getText().toString().trim();

                db = AppDatabase.getDbInstance(getApplicationContext());
                List<Responsi> responsiList = db.userDao().getAll();

                if (responsi != null) {
                    Intent home = new Intent(LoginActivity.this, MainActivity.class);
                    home.putExtra("Pengguna", String.valueOf(responsi));
                    startActivity(home);
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Something Happened", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }