package com.example.autonoma.ejercicio3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etUsuario, etClave;
    Button btnLogin,btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        etUsuario= findViewById(R.id.edUsuario);
        etClave= findViewById(R.id.edClave);

        btnLogin=findViewById(R.id.btnLogin);
        btnSalir=findViewById(R.id.btnSalir);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //logearse hardcode
                if(etUsuario.getText().toString().equals("katherine") &&
                        etClave.getText().toString().equals("123"))
                     //
                {
                    Intent intent = new Intent(
                            MainActivity.this,
                            ProfesoresActivity.class);
                    //Ir a Profesor Activity
                    startActivity(intent);

                Toast.makeText(MainActivity.this,
                        "Bienvenido",
                        Toast.LENGTH_LONG).show();

                }//
                 else if (etUsuario.getText().toString().isEmpty() ||
                        etClave.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this,
                            "Ingrese los datos",
                            Toast.LENGTH_LONG).show();
                }
                  else
                {
                    Toast.makeText(MainActivity.this,
                    "Usuario y/o contraseña incorrecto(s)",
                    Toast.LENGTH_LONG).show();
                }



            }
        });//setOnClickListener

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
               // System.exit(0);
            }
        });


    }
}
