package com.example.capsulas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View v){

        EditText campo1 = this.findViewById(R.id.correo);
        String correo = campo1.getText().toString();
        EditText campo2 = this.findViewById(R.id.contrasenia);
        String contrasenia = campo2.getText().toString();

        if(correo.equals("c1") && contrasenia.equals("123")){
            Intent i = new Intent(this,Principal1.class);
            startActivity(i);
        }else{
            Toast.makeText(this, "Error en las credenciales", Toast.LENGTH_SHORT).show();
        }



    }

    public void crearCuenta(View v){
        Intent i = new Intent(this,RegistrarCuenta.class);
        startActivity(i);
    }

}