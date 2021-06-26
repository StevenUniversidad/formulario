package com.example.formulariocuarentena;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class GuardarActividad extends AppCompatActivity {
    EditText txtnombre1;
    TextView txtview_guardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guardar_actividad);
        txtnombre1 = findViewById(R.id.txtnombre1);
        txtview_guardar = findViewById(R.id.textView_guardar);

        String datos = "Email: " + getIntent().getStringExtra("txtemail")+ "\nDomicilio: "+getIntent().getStringExtra("txtdomicilio")+ "\nDepartamento: "+getIntent().getStringExtra("cbxdeptos")+ "\nHorario: "+getIntent().getStringExtra("tiempo");
        txtnombre1.setText(getIntent().getStringExtra("txtnombre"));
        txtview_guardar.setText(datos);
    }
}