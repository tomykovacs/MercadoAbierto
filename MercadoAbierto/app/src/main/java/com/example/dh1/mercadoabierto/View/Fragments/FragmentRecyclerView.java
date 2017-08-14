package com.example.dh1.mercadoabierto.View.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dh1.mercadoabierto.Controller.Controller;
import com.example.dh1.mercadoabierto.Model.POJO.Articulo;
import com.example.dh1.mercadoabierto.R;
import com.example.dh1.mercadoabierto.View.Adapters.Adapter;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentRecyclerView extends Fragment {

    private RecyclerView recyclerView;
    private Adapter adapter;
    private Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_recycler_view, container, false);

        Controller controller = new Controller();
        List<Articulo> articulos = controller.getArticulos();

        context = getContext();

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewArticulos);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new Adapter(context, articulos);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer position = recyclerView.getChildAdapterPosition(v);
                Articulo articulo = adapter.getItem(position);
                OnFragmentListener onFragmentListener = (OnFragmentListener) context;
                onFragmentListener.listeningFragmentRecyclerView(articulo);
            }
        };
        adapter.setmListener(listener);
        recyclerView.setAdapter(adapter);

        return view;
    }

    public interface OnFragmentListener {
        void listeningFragmentRecyclerView(Articulo articulo);
    }
}
