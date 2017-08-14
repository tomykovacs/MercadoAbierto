package com.example.dh1.mercadoabierto.View.Fragments;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dh1.mercadoabierto.R;
import com.example.dh1.mercadoabierto.View.Activities.MainActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetalle extends Fragment {

    public static final String CLAVE_NOMBRE = "nombre";
    public static final String CLAVE_PRECIO = "precio";
    public static final String CLAVE_DESCRIPCION = "descripcion";
    public static final String CLAVE_IMAGEN = "imagen";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_detalle, container, false);

        Bundle bundle = getArguments();
        final String nombre = bundle.getString(CLAVE_NOMBRE);
        String precio = bundle.getString(CLAVE_PRECIO);
        String descripcion = bundle.getString(CLAVE_DESCRIPCION);
        Integer imagen = bundle.getInt(CLAVE_IMAGEN);

        TextView textViewNombre = (TextView) view.findViewById(R.id.textViewNombreArticuloDetalle);
        TextView textViewPrecio = (TextView) view.findViewById(R.id.textViewPrecioArticuloDetalle);
        TextView textViewDescripcion = (TextView) view.findViewById(R.id.textViewDescripcionArticulo);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageViewArticuloDetalle);

        textViewNombre.setText(nombre);
        textViewPrecio.setText(precio);
        textViewDescripcion.setText(descripcion);
        imageView.setImageResource(imagen);

        Button buttonComprar = (Button) view.findViewById(R.id.buttonComprar);
        buttonComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getContext();
                Toast.makeText(context, "Compraste " + nombre, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }

}
