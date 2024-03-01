package com.example.restaurantemexicano;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class Login extends AppCompatActivity {
    EditText etUsuario = null;
    EditText etContrasena = null;
    Button registro = null;
    Button iniciarSesion  = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.red));

        etUsuario = findViewById(R.id.usuario);
        etContrasena = findViewById(R.id.contrasena);
        registro = findViewById(R.id.botonRegistro);
        iniciarSesion = findViewById(R.id.botonIniciarSesion);

        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Registro.class);
                startActivity(intent);
            }
        });

        iniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validarDatos()){
                    Intent intent = new Intent(Login.this, Menu.class);

                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                }
            }
        });
    }

    private boolean validarDatos() {
        String usuario = etUsuario.getText().toString();
        String contrasena = etContrasena.getText().toString();

        if (usuario.isEmpty() || contrasena.isEmpty()){
            Toast.makeText(Login.this, "Rellena todos los campos para continuar", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }
}

