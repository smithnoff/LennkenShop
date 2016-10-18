package com.skynoff.udo.lennkenshop;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Skynoff on 16/10/2016.
 */

public class adaptador extends RecyclerView.Adapter<adaptador.productoViewHolder> {
    private List<producto> items;

    public static class productoViewHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item
        public ImageView imagen;
        public TextView nombre;
        public TextView precio;

        public productoViewHolder(View v) {
            super(v);
            imagen = (ImageView) v.findViewById(R.id.ivProducto);
            nombre = (TextView) v.findViewById(R.id.tvNombre);
            precio = (TextView) v.findViewById(R.id.tvPrecio);
        }
    }

    public adaptador(List<producto> items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public productoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cardview_producto, viewGroup, false);
        int height = viewGroup.getMeasuredHeight() *2;
        v.setMinimumHeight(height);
        return new productoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(productoViewHolder viewHolder, int i) {
        viewHolder.imagen.setImageResource(items.get(i).getImagen());
        viewHolder.nombre.setText(items.get(i).getNombre());
        viewHolder.precio.setText("precio:"+String.valueOf(items.get(i).getPrecio()));
    }
}