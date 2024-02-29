package com.example.restaurantemexicano;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class Login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.red));

        Button registro = findViewById(R.id.botonRegistro);
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Registro.class);
                startActivity(intent);
            }
        });

        Button confirmar = findViewById(R.id.botonConfirmar);
        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String usuario = ((EditText) findViewById(R.id.usuario));
                //String contrasena = ((EditText) findViewById(R.id.contrasena));
            }
        });

    }
}

