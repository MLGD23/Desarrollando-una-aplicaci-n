package com.example.ejerciciosem2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private TextView mDiaplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btnSiguiente);

        mDiaplayDate = (TextView) findViewById(R.id.tvfecha);
        mDiaplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                        int year = cal.get(Calendar.YEAR);
                        int month = cal.get(Calendar.MONTH);
                        int day = cal.get(Calendar.DAY_OF_MONTH);




                        DatePickerDialog dialog = new DatePickerDialog(
                                MainActivity.this,
                                android.R.style.Animation_Translucent,
                                mDateSetListener,
                                year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.LTGRAY));
                dialog.show();
                mDateSetListener = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                        String Date  = day + "/" + month + "/" + year;
                        mDiaplayDate.setText(Date);

                    }
        };
    }
}
);

    }
    public void Siguiente(View view){
        Intent siguiente = new Intent(this, Confirmar.class);
        startActivity(siguiente);
    }
    }