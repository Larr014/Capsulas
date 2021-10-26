package com.example.capsulas;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.capsulas.modelo.Producto;

import java.util.ArrayList;
import java.util.List;


public class Micros extends Fragment {

    private ArrayList<Producto> listado;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_micros, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ListView l = (ListView) view.findViewById(R.id.lvProductos);
        Adaptador adaptador = new Adaptador(getContext(),cargar_datos());
        l.setAdapter(adaptador);
    }

    public ArrayList<Producto> cargar_datos(){
        listado = new ArrayList<>();
        listado.add(new Producto("https://firebasestorage.googleapis.com/v0/b/fir-1152f.appspot.com/o/productos%2F1200px-PS4-Console-wDS4.jpg?alt=media&token=07c21dee-df70-46f5-ab9a-385beb86abf0","PS4",900000,4));
        listado.add(new Producto("https://firebasestorage.googleapis.com/v0/b/fir-1152f.appspot.com/o/productos%2F9769090c-3d1d-4833-a935-5137fc7d6402.jpg?alt=media&token=78340695-6c16-4818-a3fb-22607fcc26ff","Xbox",500000,3));
        listado.add(new Producto("https://firebasestorage.googleapis.com/v0/b/fir-1152f.appspot.com/o/productos%2FH2x1_NSwitch_support_no_logo.jpg?alt=media&token=4b09d0f2-f5b0-48ca-95d8-f37b344b7b92","Switch",250000,2));
        return listado;
}




}