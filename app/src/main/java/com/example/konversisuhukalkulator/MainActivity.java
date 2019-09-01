package com.example.konversisuhukalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Konversi Suhu");

        final EditText etCelcius = (EditText)findViewById(R.id.txtCelcius);
        final EditText etKelvin = (EditText)findViewById(R.id.txtKelvin);
        final EditText etFahrenheit = (EditText)findViewById(R.id.txtFahrenheit);
        final EditText etReamur = (EditText)findViewById(R.id.txtReamur);
        Button btnSubmit = (Button)findViewById(R.id.btnHitung);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String celcius = etCelcius.getText().toString();

                    Double cel = Double.parseDouble(celcius);

                    Double fahrenheit = (cel * 9/5) + 32;
                    Double kelvin = cel + 273;
                    Double re = cel * 4/5;

                    etKelvin.setText(kelvin.toString());
                    etFahrenheit.setText(fahrenheit.toString());
                    etReamur.setText(re.toString());

            }
        });

    }
}
