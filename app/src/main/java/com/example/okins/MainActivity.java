package com.example.okins;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNombre;
    private EditText editTextMonto;
    private Button btnSubir;
    private LinearLayout layoutPadre;
    private int contador = 1;
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
                String valorEditText = editTextNombre.getText().toString();
                agregarRegistro(valorEditText, montoNumerico);



            }
        });
    }

    private void agregarRegistro(String nombre, int monto){
        layoutPadre = findViewById(R.id.layoutPadre);
        LinearLayout layoutHijo = new LinearLayout(this);
        layoutHijo.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        layoutHijo.setOrientation(LinearLayout.VERTICAL);

        TextView textViewNombre = new TextView(this);
        textViewNombre.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        textViewNombre.setText("Nombre: " + nombre);
        textViewNombre.setId(View.generateViewId()); // Generar ID único
        layoutHijo.addView(textViewNombre);

        TextView textViewMonto = new TextView(this);
        textViewMonto.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        textViewMonto.setText("Monto: $" + monto);
        textViewMonto.setId(View.generateViewId()); // Generar ID único
        layoutHijo.addView(textViewMonto);

        layoutHijo.setId(View.generateViewId());
        layoutPadre.addView(layoutHijo);


        // Mostrar el valor en el Log
        Log.i("MainActivity", "Valor del EditText: " + nombre + monto);

    }
}