package com.example.conexahotspot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginConexa extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_conexa);

        ImageView btnKembali = findViewById(R.id.back);
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        btnLogin = findViewById(R.id.buttonLogin);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                if (validasi(username,password)){

                    Intent intent = new Intent(LoginConexa.this, Dashboard.class);
                    startActivity(intent);
                    finish();

                } else {
                    Toast.makeText(LoginConexa.this, "Username atau Password Salah", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginConexa.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private boolean validasi(String username, String password){
        return username.equals("yusufseptiana@gmail.com")&& password.equals("conexahotspot");
    }
}