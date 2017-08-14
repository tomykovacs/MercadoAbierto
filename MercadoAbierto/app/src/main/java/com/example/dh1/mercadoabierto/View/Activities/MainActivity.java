package com.example.dh1.mercadoabierto.View.Activities;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dh1.mercadoabierto.Model.POJO.Articulo;
import com.example.dh1.mercadoabierto.View.Fragments.FragmentDetalle;
import com.example.dh1.mercadoabierto.View.Fragments.FragmentRecyclerView;
import com.example.dh1.mercadoabierto.R;

public class MainActivity extends AppCompatActivity implements FragmentRecyclerView.OnFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentRecyclerView fragmentRecyclerView = new FragmentRecyclerView();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.activity_main, fragmentRecyclerView);
        fragmentTransaction.commit();
    }

    @Override
    public void listeningFragmentRecyclerView(Articulo articulo) {
        Intent intent = new Intent (MainActivity.this, DetalleActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(FragmentDetalle.CLAVE_NOMBRE, articulo.getNombre());
        bundle.putString(FragmentDetalle.CLAVE_PRECIO, articulo.getPrecio());
        bundle.putString(FragmentDetalle.CLAVE_DESCRIPCION, articulo.getDescripcion());
        bundle.putInt(FragmentDetalle.CLAVE_IMAGEN, articulo.getFotoResource());
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
