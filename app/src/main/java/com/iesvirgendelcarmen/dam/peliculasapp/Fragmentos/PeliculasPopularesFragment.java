package com.iesvirgendelcarmen.dam.peliculasapp.Fragmentos;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.iesvirgendelcarmen.dam.peliculasapp.Modelo.Pelicula;
import com.iesvirgendelcarmen.dam.peliculasapp.Modelo.PeliculaAdapter;
import com.iesvirgendelcarmen.dam.peliculasapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PeliculasPopularesFragment extends Fragment {

    private ListView listView;
    private PeliculaAdapter adapter;

    public PeliculasPopularesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_peliculas_populares, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        listView = view.findViewById(R.id.listViewPeliculas);
        adapter = new PeliculaAdapter(getContext(), Pelicula.mockPeliculas());
        listView.setAdapter(adapter);

    }
}
