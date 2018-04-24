package com.rdr.rodrigocorvera.seriesapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rodrigo Corvera on 23/4/2018.
 */

public class FragmentContent extends Fragment implements CardView.OnClickListener{

    private List<Movies> peliculas;
    private MoviesAdapter moviesAdapter;
    private Reader reader;
    private Context context;

    public FragmentContent () {

    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        reader = new Reader(getActivity());
        peliculas = new ArrayList<Movies>();
        fillList();

        moviesAdapter = new MoviesAdapter(getActivity(),peliculas);
        RecyclerView recyclerView = view.findViewById(R.id.RecView);
        LinearLayoutManager linear = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linear);
        recyclerView.setAdapter(moviesAdapter);
        //text = view.findViewById(R.id.textId);


        return view;
    }

    private ArrayList<Movies> values () {
        return (ArrayList<Movies>) peliculas;
    }

    private void fillList() {
        List<String> linesFromFile = reader.getLines();
        Log.d("Numero de resultados", String.valueOf(reader.getCounter()));
        Log.d("Linea 1", linesFromFile.get(0));
        Log.d("Linea 2", linesFromFile.get(1));
        Log.d("Linea 3", linesFromFile.get(2));
        Log.d("Linea 4", linesFromFile.get(3));
        for (int i = 0; i < (reader.getCounter()/2); i++) {
            try{
                peliculas.add(new Movies(linesFromFile.get(2*i),linesFromFile.get((2*i)+1)));
            }catch(ArrayIndexOutOfBoundsException e){
                Log.d("Error", e.getMessage());
            }

        }
    }

    @Override
    public void onClick(View view) {
        Log.d("click","Un click");
    }
    public void Element (){
        Log.d("click","Un click");
    }
}
