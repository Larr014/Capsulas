package com.example.capsulas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.capsulas.modelo.Usuario;

public class RegistrarCuenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_cuenta);
    }

    public void registrar(View v){
        //Recupero el View
        EditText etUsuario = (EditText) findViewById(R.id.etUsuario);
        //Recupero su contenido
        String usuario = etUsuario.getText().toString();
        //Recupero el View
        EditText etCorreo = (EditText) findViewById(R.id.etCorreo);
        //Recupero su contenido
        String correo = etCorreo.getText().toString();
        //Recupero el View
        EditText etPassword = (EditText) findViewById(R.id.etPassword);
        //Recupero su valor
        String password = etPassword.getText().toString();
        //Recupero el View
        EditText etPassword2 = (EditText) findViewById(R.id.etPassword2);
        //Recupero su valor
        String password2 = etPassword2.getText().toString();
        //Recupero el View RadioGroup
        RadioGroup rgGenero = (RadioGroup) findViewById(R.id.rgGenero);
        //Consigo el id del radio seleccionado
        int idGenero = rgGenero.getCheckedRadioButtonId();
        //Recupero su contenido
        String genero = "";
        switch (idGenero){
            case R.id.rbMasculino:
                genero = "Masculino";
                break;
            case R.id.rbFemenino:
                genero = "Femenino";
                break;
        }
        //Recupero el View spinner
        Spinner spCiudad = (Spinner) findViewById(R.id.spCiudad);
        //Recupero su contenido
        String ciudad = spCiudad.getSelectedItem().toString();
        //Valido datos
        if(password.equals(password2)){
            Usuario u = new Usuario(usuario,correo,password,genero,ciudad);
            Toast.makeText(this, "Registro Exitoso", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
        }

    }

}