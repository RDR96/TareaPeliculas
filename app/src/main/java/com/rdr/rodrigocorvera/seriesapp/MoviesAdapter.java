package com.rdr.rodrigocorvera.seriesapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Rodrigo Corvera on 23/4/2018.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>{

    Context context;
    List<Movies> listaPeliculas;


    public MoviesAdapter (Context context, List<Movies> lista){
        this.context = context;
        listaPeliculas = lista;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) { //
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.cardview, null);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        v.setLayoutParams(lp);

        return new MovieViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) { //AQUI SE PUEDE ASIGNAR EL CONTENIDO
        holder.tittleTxtView.setText(listaPeliculas.get(position).getName());
        holder.descriptionTxtView.setText(listaPeliculas.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return listaPeliculas.size();
    }

    protected class MovieViewHolder extends  RecyclerView.ViewHolder {
        TextView tittleTxtView;
        TextView descriptionTxtView;

        public MovieViewHolder(View itemView) {
            super(itemView);
            tittleTxtView = itemView.findViewById(R.id.movieName);
            descriptionTxtView = itemView.findViewById(R.id.movieDescription);
        }
    }

}
