package com.rdr.rodrigocorvera.seriesapp;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListActivity;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity implements CardView.OnClickListener{

    private List<Movies> peliculas;
    private MoviesAdapter moviesAdapter;

    private Reader reader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //FragmentContent value  = new FragmentContent();
        /*FragmentContent frag = new FragmentContent();
        //frag.setArguments(bundle);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.viewer, frag);
        fragmentTransaction.commit();*/


        /*reader = new Reader(MainActivity.this);
        peliculas = new ArrayList<Movies>();
        fillList();

        moviesAdapter = new MoviesAdapter(this,peliculas);
        RecyclerView recyclerView = findViewById(R.id.RecView);
        LinearLayoutManager linear = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linear);
        recyclerView.setAdapter(moviesAdapter);*/
    }

    public void changeScreen (View v) {
        String state = v.getTag().toString();

        if (state.equals("1")) {

        } else {
            Log.d("Entro","Si");
            Bundle bundle = new Bundle();
            //bundle.putString("KEY", adapterView.getItemAtPosition(i).toString());
            //FragmentContent fg1 = new FragmentContent();
            //ArrayList<Movies> elements = fg1.get;
            anotherFrag frag = new anotherFrag();
            //frag.setArguments(bundle);
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.viewer, frag);
            fragmentTransaction.commit();
        }

    }

    @Override
    public void onClick(View view) {
        Log.d("Element","Elddsdsd");
    }
}
