package com.example.restaurantemexicano;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.util.logging.Logger;

public class Menu extends AppCompatActivity {
    TextView tvDatos = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.red));

        tvDatos = ((TextView) findViewById(R.id.textview_datos));

    }
}
