package com.example.dh1.mercadoabierto.View.Activities;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dh1.mercadoabierto.View.Fragments.FragmentDetalle;
import com.example.dh1.mercadoabierto.R;

public class DetalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        FragmentDetalle fragmentDetalle = new FragmentDetalle();

        Intent intent = getIntent();
        fragmentDetalle.setArguments(intent.getExtras());

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.activity_detalle, fragmentDetalle);
        fragmentTransaction.commit();
    }
}
