package co.reyesmagos.marcasquiz.factories.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.List;

import co.reyesmagos.marcasquiz.R;
import co.reyesmagos.marcasquiz.entities.Marca;
import co.reyesmagos.marcasquiz.factories.IFactoryMarca;

/**
 * Created by oscargallon on 19/12/14.
 */
public class FactoryMarca implements IFactoryMarca {

    public static FactoryMarca instance;
    private List<Marca> listaMarcas;
    private Context context;

    private FactoryMarca() {

    }

    public static FactoryMarca getInstance() {
        if (instance == null)
            instance = new FactoryMarca();
        return instance;
    }

    @Override
    public List<Marca> getMarcaList() {
        return this.listaMarcas;
    }

    @Override
    public void createMarcas() {
        this.listaMarcas= new ArrayList<Marca>();
        Marca marca = new Marca();

        List<Drawable> listDrawables = new ArrayList<Drawable>();
        marca.setMarcaName("AKT");

        Drawable drawable = context.getResources().getDrawable(R.drawable.akt_1);
        listDrawables.add(drawable);
        drawable = context.getResources().getDrawable(R.drawable.akt_2);
        listDrawables.add(drawable);
        drawable = context.getResources().getDrawable(R.drawable.akt_3);
        listDrawables.add(drawable);
        drawable = context.getResources().getDrawable(R.drawable.akt_4);
        listDrawables.add(drawable);
        drawable = context.getResources().getDrawable(R.drawable.akt_5);
        listDrawables.add(drawable);
        marca.setImagesClue(listDrawables);
        listaMarcas.add(marca);

        marca= new Marca();
        listDrawables = new ArrayList<Drawable>();
        marca.setMarcaName("Avianca");
        drawable = context.getResources().getDrawable(R.drawable.avianca_1);
        listDrawables.add(drawable);
        drawable = context.getResources().getDrawable(R.drawable.avianca_2);
        listDrawables.add(drawable);
        drawable = context.getResources().getDrawable(R.drawable.avianca_3);
        listDrawables.add(drawable);
        drawable = context.getResources().getDrawable(R.drawable.avianca_4);
        listDrawables.add(drawable);
        drawable = context.getResources().getDrawable(R.drawable.avianca_5);
        listDrawables.add(drawable);
        marca.setImagesClue(listDrawables);
        listaMarcas.add(marca);

        marca= new Marca();
        listDrawables = new ArrayList<Drawable>();
        marca.setMarcaName("Baloto");
        drawable = context.getResources().getDrawable(R.drawable.baloto_1);
        listDrawables.add(drawable);
        drawable = context.getResources().getDrawable(R.drawable.baloto_2);
        listDrawables.add(drawable);
        drawable = context.getResources().getDrawable(R.drawable.baloto_3);
        listDrawables.add(drawable);
        drawable = context.getResources().getDrawable(R.drawable.baloto_4);
        listDrawables.add(drawable);
        drawable = context.getResources().getDrawable(R.drawable.baloto_5);
        listDrawables.add(drawable);
        marca.setImagesClue(listDrawables);
        listaMarcas.add(marca);

        marca= new Marca();
        listDrawables = new ArrayList<Drawable>();
        marca.setMarcaName("Baloto");
        drawable = context.getResources().getDrawable(R.drawable.exito_1);
        listDrawables.add(drawable);
        drawable = context.getResources().getDrawable(R.drawable.exito_2);
        listDrawables.add(drawable);
        drawable = context.getResources().getDrawable(R.drawable.exito_3);
        listDrawables.add(drawable);
        drawable = context.getResources().getDrawable(R.drawable.exito_4);
        listDrawables.add(drawable);
        drawable = context.getResources().getDrawable(R.drawable.exito_5);
        listDrawables.add(drawable);
        marca.setImagesClue(listDrawables);
        marca.setWasDiscovered(true);
        listaMarcas.add(marca);



    }
}
