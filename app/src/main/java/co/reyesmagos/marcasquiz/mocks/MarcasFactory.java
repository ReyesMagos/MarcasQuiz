package co.reyesmagos.marcasquiz.mocks;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.List;

import co.reyesmagos.marcasquiz.R;
import co.reyesmagos.marcasquiz.entities.Marca;

/**
 * Created by Alexis-PC on 18/12/2014.
 */
public class MarcasFactory {

    public static MarcasFactory instance;
    private List<Marca> marcasList;

    private MarcasFactory(){


    }

    public static MarcasFactory getInstance(){
        if(instance==null)
            instance = new MarcasFactory();
        return instance;
    }

    public static void setInstance(MarcasFactory instance) {
        MarcasFactory.instance = instance;
    }

    public List<Marca> getMarcasList() {
        return marcasList;
    }

    public void setMarcasList(List<Marca> marcasList) {
        this.marcasList = marcasList;
    }

    public void createMarca(){


       this.marcasList = new ArrayList<Marca>();
        Marca marca = new Marca();
        marca.setMarcaName("Exito");
        List<Integer>drawableList = new ArrayList<Integer>();
        drawableList.add((R.drawable.exito_1));
        drawableList.add((R.drawable.exito_2));
        drawableList.add((R.drawable.exito_3));
        drawableList.add((R.drawable.exito_4));
        drawableList.add((R.drawable.exito_5));
        marca.setImagesClue(drawableList);
        marca.setWasDiscovered(true);
        this.marcasList.add(marca);

        marca = new Marca();
        marca.setMarcaName("AKT");
        drawableList = new ArrayList<Integer>();
        drawableList.add((R.drawable.akt_1));
        drawableList.add((R.drawable.akt_2));
        drawableList.add((R.drawable.akt_3));
        drawableList.add((R.drawable.akt_4));
        drawableList.add((R.drawable.akt_5));
        marca.setImagesClue(drawableList);
        this.marcasList.add(marca);


        marca = new Marca();
        marca.setMarcaName("Avianca");
        drawableList = new ArrayList<Integer>();
        drawableList.add((R.drawable.avianca_1));
        drawableList.add((R.drawable.avianca_2));
        drawableList.add((R.drawable.avianca_3));
        drawableList.add((R.drawable.avianca_4));
        drawableList.add((R.drawable.avianca_5));
        marca.setImagesClue(drawableList);
        this.marcasList.add(marca);

        marca = new Marca();
        marca.setMarcaName("Avianca");
        drawableList = new ArrayList<Integer>();
        drawableList.add((R.drawable.baloto_1));
        drawableList.add((R.drawable.baloto_2));
        drawableList.add((R.drawable.baloto_3));
        drawableList.add((R.drawable.baloto_4));
        drawableList.add((R.drawable.baloto_5));
        marca.setImagesClue(drawableList);
        this.marcasList.add(marca);



    }

    public void updateMarca(Marca marca){
        for(Marca m: this.marcasList){
            if(m.getMarcaName().equals(marca.getMarcaName())){
                m=marca;
            }
        }
    }




}
