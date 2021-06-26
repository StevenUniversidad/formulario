package com.example.formulariocuarentena;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtnombre, txtemail, txtdomicilio;
    Button btnguardar;
    Spinner cbxdeptos;
    RadioButton rbcompleto, rbmedio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnombre= findViewById(R.id.txtnombre);
        txtemail= findViewById(R.id.txtemail);
        txtdomicilio= findViewById(R.id.txt_domicilio);
        cbxdeptos= findViewById(R.id.cbx_deptos);
        rbcompleto= findViewById(R.id.rbcompleto);
        rbmedio= findViewById(R.id.rbmedio);
        btnguardar= findViewById(R.id.btnguardar);

        btnguardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtnombre.getText().toString().equals("")||txtemail.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Debe agregar su nombre y correo electronico", Toast.LENGTH_LONG).show();
                }else{
                    Intent intent = new Intent(MainActivity.this, GuardarActividad.class);
                    intent.putExtra("txtnombre", txtnombre.getText().toString());
                    intent.putExtra("txtemail", txtemail.getText().toString());
                    intent.putExtra("txtdomicilio", txtdomicilio.getText().toString());
                    intent.putExtra("cbxdeptos", cbxdeptos.getSelectedItem().toString());
                    String horario = "";
                    if (rbcompleto.isChecked()){
                        horario= "Tiempo Completo";
                    }else{
                        horario= "Medio Tiempo";
                    }
                    intent.putExtra("tiempo", horario);
                    startActivity(intent);
                }
            }
        });
    }
}