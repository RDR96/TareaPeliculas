package com.rdr.rodrigocorvera.seriesapp;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rodrigo Corvera on 23/4/2018.
 */

public class Reader {
    private Context context;
    private int counter;

    public Reader (Context context) {
        this.context = context;
        counter = 0;
    }

    public List<String> getLines (){
        List<String> lines = new ArrayList<>();
        AssetManager am = context.getResources().getAssets();
        try{
            InputStream file = am.open("Prueba.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(file));
            String line;
            while ( (line  = reader.readLine()) != null ) {
                counter++;
                Log.d("Valores de arreglo: ", line);
                lines.add(line);
            }

            Log.d("Info","Todo bien");
        }catch (Exception e){
            Log.d("Error","No se encontro el archivo");
        }

        return lines;
    }

    public int getCounter(){
        return counter;
    }

}
