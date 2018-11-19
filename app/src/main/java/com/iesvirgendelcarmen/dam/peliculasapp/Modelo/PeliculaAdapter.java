package com.iesvirgendelcarmen.dam.peliculasapp.Modelo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.iesvirgendelcarmen.dam.peliculasapp.R;

import java.util.List;

public class PeliculaAdapter extends BaseAdapter {

    private String IMAGE_BASE_URL = "http://image.tmdb.org/t/p/w200";
    private Context context;
    private List<Pelicula> peliculas;

    public PeliculaAdapter(Context context, List<Pelicula> peliculas) {
        this.context = context;
        this.peliculas = peliculas;
    }

    @Override
    public int getCount() {
        return peliculas.size();
    }

    @Override
    public Object getItem(int position) {
        return peliculas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return peliculas.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Pelicula peli = peliculas.get(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.peliculas_item, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageViewPortada);
        TextView textView = convertView.findViewById(R.id.textViewTitulo);


        textView.setText(peli.getTitulo());

        Glide.with(convertView)
                .load(IMAGE_BASE_URL+peli.getPortada())
                .apply(RequestOptions.placeholderOf(R.color.colorPrimary))
                .into(imageView);

        return convertView;
    }

}
