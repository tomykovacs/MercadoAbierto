package com.example.dh1.mercadoabierto.View.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dh1.mercadoabierto.Model.POJO.Articulo;
import com.example.dh1.mercadoabierto.R;

import java.util.List;

/**
 * Created by dh1 on 03/05/17.
 */

public class Adapter extends RecyclerView.Adapter implements View.OnClickListener{

    private List<Articulo> listaDeArticulos;
    private Context context;
    private View.OnClickListener mListener;

    public Adapter(Context context, List<Articulo> listaDeArticulos) {
        this.context = context;
        this.listaDeArticulos = listaDeArticulos;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_recycler_view, parent, false);
        view.setOnClickListener(this);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Articulo unArticulo = listaDeArticulos.get(position);
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.cargarDatos(unArticulo);
    }

    @Override
    public int getItemCount() {
        return listaDeArticulos.size();
    }

    public Articulo getItem(Integer position) {
        return listaDeArticulos.get(position);
    }

    public void setmListener(View.OnClickListener mListener) {
        this.mListener = mListener;
    }

    @Override
    public void onClick(View v) {
        if(mListener != null) {
            mListener.onClick(v);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView textViewNombre;
        private TextView textViewPrecio;
        private ImageView imagenArticulo;

        public ViewHolder (View view) {
            super (view);
            textViewNombre = (TextView) view.findViewById(R.id.textViewNombreArticulo);
            textViewPrecio = (TextView) view.findViewById(R.id.textViewPrecioArticulo);
            imagenArticulo = (ImageView) view.findViewById(R.id.imageViewArticulo);
        }

        public void cargarDatos(Articulo unArticulo) {
            textViewNombre.setText(unArticulo.getNombre());
            textViewPrecio.setText(unArticulo.getPrecio());
            imagenArticulo.setImageResource(unArticulo.getFotoResource());
        }
    }
}
