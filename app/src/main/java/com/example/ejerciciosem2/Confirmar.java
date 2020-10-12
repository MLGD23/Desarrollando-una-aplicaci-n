package com.example.ejerciciosem2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Confirmar extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar);
    }
    public void EditarDatos(View view){
        Intent editardatos = new Intent(this, MainActivity.class);
        startActivity(editardatos);
    }
}
