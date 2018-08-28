package com.max.proyecto02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Proyecto02Activity extends AppCompatActivity {
    private EditText et1, et2;
    private TextView tv1;
    private Button botSumar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.proyecto02);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        tv1=findViewById(R.id.tv1);
        botSumar=findViewById(R.id.botSuma);
    }
    public void sumar(View view){
    String valor1=et1.getText().toString();
    String valor2=et2.getText().toString();
    int nro1=Integer.parseInt(valor1);
    int nro2=Integer.parseInt(valor2);
    int suma=nro1 + nro2;
    String resu=String.valueOf(suma);
    tv1.setText(resu);
    }
}
