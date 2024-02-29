package com.example.restaurantemexicano;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class Registro extends AppCompatActivity {
    EditText etUsuario = null;
    EditText etCorreoElectronico = null;
    EditText etContrasena = null;
    EditText etContrasena2 = null;
    Button confirmar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.red));

        etUsuario = findViewById(R.id.usuarioRegistro);
        etCorreoElectronico = findViewById(R.id.correoRegistro);
        etContrasena = findViewById(R.id.contrasenaRegistro);
        etContrasena2 = findViewById(R.id.contrasenaRegistro2);
        confirmar = findViewById(R.id.botonConfirmarRegistro);

        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              if (validarDatos()) {
                  Intent intent = new Intent(Registro.this, Menu.class);

                  intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                  intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                  startActivity(intent);
              }
            }
        });
    }

    private boolean validarDatos() {
        String usuario = etUsuario.getText().toString();
        String correoElectronico = etCorreoElectronico.getText().toString();
        String contrasena = etContrasena.getText().toString();
        String contrasena2 = etContrasena2.getText().toString();

        if (usuario.isEmpty() || correoElectronico.isEmpty() || contrasena.isEmpty() || contrasena2.isEmpty()){
            Toast t = new Toast(this);
            t.setText("Rellena todos los campos para continuar");
            t.setDuration(Toast.LENGTH_SHORT);
            t.show();
            return false;
        }
        else if (!contrasena.equals(contrasena2)) {
            Toast t = new Toast(this);
            t.setText("Las contraseñas deben ser iguales");
            t.setDuration(Toast.LENGTH_SHORT);
            t.show();
            return false;
        }

        return true;
    }
}
