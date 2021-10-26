package com.example.capsulas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.capsulas.modelo.Producto;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    private Context contexto;
    private ArrayList<Producto> listItems;

    public Adaptador(Context contexto, ArrayList<Producto> listItems) {
        this.contexto = contexto;
        this.listItems = listItems;
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int i) {
        return listItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(contexto).inflate(R.layout.items_listview,null);
        ImageView ivFoto = (ImageView) view.findViewById(R.id.ivFoto);
        TextView tvNombre = (TextView) view.findViewById(R.id.tvNombre);
        TextView tvPrecio = (TextView) view.findViewById(R.id.tvPrecio);
        TextView tvCantidad = (TextView) view.findViewById(R.id.tvCantidad);
        Producto p = (Producto) getItem(i);
        Glide.with(contexto)
                .load(p.getRuta())
                .centerCrop()
                .fitCenter()
                .into(ivFoto);
        ivFoto.getLayoutParams().height = 200;
        ivFoto.getLayoutParams().width = 200;
        tvNombre.setText(p.getNombre());
        tvPrecio.setText(""+p.getPrecio());
        tvCantidad.setText(""+p.getCantidad());
        return view;
    }
}
