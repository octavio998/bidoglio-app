package com.example.okins;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNombre;
    private EditText editTextMonto;
    private Button btnSubir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNombre = findViewById(R.id.editTextNombre);
        editTextMonto = findViewById(R.id.editTextMonto);
        btnSubir = findViewById(R.id.btnSubir);


        btnSubir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String valorEditTextMonto = editTextMonto.getText().toString();
                int montoNumerico = Integer.parseInt(valorEditTextMonto);
                // Obtener el valor del EditText
                String valorEditText = editTextNombre.getText().toString();

                // Mostrar el valor en el Log
                Log.i("MainActivity", "Valor del EditText: " + valorEditText);
                Log.i("MainActivity", "Valor del MONTO: " + montoNumerico);


            }
        });
    }
}