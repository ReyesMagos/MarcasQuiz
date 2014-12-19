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

    private MarcasFactory() {


    }

    public static MarcasFactory getInstance() {
        if (instance == null)
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

    public void createMarca() {


        this.marcasList = new ArrayList<Marca>();
        Marca marca = new Marca();
        marca.setMarcaName("Exito");
        List<Integer> drawableList = new ArrayList<Integer>();
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
        marca.setMarcaName("Baloto");
        drawableList = new ArrayList<Integer>();
        drawableList.add((R.drawable.baloto_1));
        drawableList.add((R.drawable.baloto_2));
        drawableList.add((R.drawable.baloto_3));
        drawableList.add((R.drawable.baloto_4));
        drawableList.add((R.drawable.baloto_5));
        marca.setImagesClue(drawableList);
        this.marcasList.add(marca);

        marca = new Marca();
        marca.setMarcaName("Bancolombia");
        drawableList = new ArrayList<Integer>();
        drawableList.add((R.drawable.bancolombia_1));
        drawableList.add((R.drawable.bancolombia_2));
        drawableList.add((R.drawable.bancolombia_3));
        drawableList.add((R.drawable.bancolombia_4));
        drawableList.add((R.drawable.bancolombia_5));
        marca.setImagesClue(drawableList);
        this.marcasList.add(marca);

        marca = new Marca();
        marca.setMarcaName("Colombina");
        drawableList = new ArrayList<Integer>();
        drawableList.add((R.drawable.colombina_1));
        drawableList.add((R.drawable.colombina_2));
        drawableList.add((R.drawable.colombina_3));
        drawableList.add((R.drawable.colombina_4));
        drawableList.add((R.drawable.colombina_5));
        marca.setImagesClue(drawableList);
        this.marcasList.add(marca);


        marca = new Marca();
        marca.setMarcaName("Flamingo");
        drawableList = new ArrayList<Integer>();
        drawableList.add((R.drawable.flamingo_1));
        drawableList.add((R.drawable.flamingo_2));
        drawableList.add((R.drawable.flamingo_3));
        drawableList.add((R.drawable.flamingo_4));
        drawableList.add((R.drawable.flamingo_5));
        marca.setImagesClue(drawableList);
        this.marcasList.add(marca);

        marca = new Marca();
        marca.setMarcaName("Haceb");
        drawableList = new ArrayList<Integer>();
        drawableList.add((R.drawable.haceb_1));
        drawableList.add((R.drawable.haceb_2));
        drawableList.add((R.drawable.haceb_3));
        drawableList.add((R.drawable.haceb_4));
        drawableList.add((R.drawable.haceb_5));
        marca.setImagesClue(drawableList);
        this.marcasList.add(marca);

        marca = new Marca();
        marca.setMarcaName("Jennos Pizza");
        drawableList = new ArrayList<Integer>();
        drawableList.add((R.drawable.jennos_pizza_1));
        drawableList.add((R.drawable.jennos_pizza_2));
        drawableList.add((R.drawable.jennos_pizza_3));
        drawableList.add((R.drawable.jennos_pizza_4));
        drawableList.add((R.drawable.jennos_pizza_5));
        marca.setImagesClue(drawableList);
        this.marcasList.add(marca);

        marca = new Marca();
        marca.setMarcaName("Postobon");
        drawableList = new ArrayList<Integer>();
        drawableList.add((R.drawable.postobon_1));
        drawableList.add((R.drawable.postobon_2));
        drawableList.add((R.drawable.postobon_3));
        drawableList.add((R.drawable.postobon_4));
        drawableList.add((R.drawable.postobon_5));
        marca.setImagesClue(drawableList);
        this.marcasList.add(marca);

        marca = new Marca();
        marca.setMarcaName("Mimos");
        drawableList = new ArrayList<Integer>();
        drawableList.add((R.drawable.mimos_1));
        drawableList.add((R.drawable.mimos_2));
        drawableList.add((R.drawable.mimos_3));
        drawableList.add((R.drawable.mimos_4));
        drawableList.add((R.drawable.mimos_5));
        marca.setImagesClue(drawableList);
        this.marcasList.add(marca);

        marca = new Marca();
        marca.setMarcaName("Qbano");
        drawableList = new ArrayList<Integer>();
        drawableList.add((R.drawable.qbano_1));
        drawableList.add((R.drawable.qbano_2));
        drawableList.add((R.drawable.qbano_3));
        drawableList.add((R.drawable.qbano_4));
        drawableList.add((R.drawable.qbano_5));
        marca.setImagesClue(drawableList);
        this.marcasList.add(marca);

        marca = new Marca();
        marca.setMarcaName("Ramo");
        drawableList = new ArrayList<Integer>();
        drawableList.add((R.drawable.ramo_1));
        drawableList.add((R.drawable.ramo_2));
        drawableList.add((R.drawable.ramo_3));
        drawableList.add((R.drawable.ramo_4));
        drawableList.add((R.drawable.ramo_5));
        marca.setImagesClue(drawableList);
        this.marcasList.add(marca);


        marca = new Marca();
        marca.setMarcaName("Refisal");
        drawableList = new ArrayList<Integer>();
        drawableList.add((R.drawable.refisal_1));
        drawableList.add((R.drawable.refisal_2));
        drawableList.add((R.drawable.refisal_3));
        drawableList.add((R.drawable.refisal_4));
        drawableList.add((R.drawable.refisal_5));
        marca.setImagesClue(drawableList);
        this.marcasList.add(marca);


        marca = new Marca();
        marca.setMarcaName("Satena");
        drawableList = new ArrayList<Integer>();
        drawableList.add((R.drawable.satena_1));
        drawableList.add((R.drawable.satena_2));
        drawableList.add((R.drawable.satena_3));
        drawableList.add((R.drawable.satena_4));
        drawableList.add((R.drawable.satena_5));
        marca.setImagesClue(drawableList);
        this.marcasList.add(marca);



        marca = new Marca();
        marca.setMarcaName("Solla");
        drawableList = new ArrayList<Integer>();
        drawableList.add((R.drawable.solla_1));
        drawableList.add((R.drawable.solla_2));
        drawableList.add((R.drawable.solla_3));
        drawableList.add((R.drawable.solla_4));
        drawableList.add((R.drawable.solla_5));
        marca.setImagesClue(drawableList);
        this.marcasList.add(marca);

        marca = new Marca();
        marca.setMarcaName("Teleantioquia");
        drawableList = new ArrayList<Integer>();
        drawableList.add((R.drawable.teleantioquia_1));
        drawableList.add((R.drawable.teleantioquia_2));
        drawableList.add((R.drawable.teleantioquia_3));
        drawableList.add((R.drawable.teleantioquia_4));
        drawableList.add((R.drawable.teleantioquia_5));
        marca.setImagesClue(drawableList);
        this.marcasList.add(marca);


        marca = new Marca();
        marca.setMarcaName("Uff Movil");
        drawableList = new ArrayList<Integer>();
        drawableList.add((R.drawable.uff_movil_1));
        drawableList.add((R.drawable.uff_movil_2));
        drawableList.add((R.drawable.uff_movil_3));
        drawableList.add((R.drawable.uff_movil_4));
        drawableList.add((R.drawable.uff_movil_5));
        marca.setImagesClue(drawableList);
        this.marcasList.add(marca);

        marca = new Marca();
        marca.setMarcaName("Viva Colombia");
        drawableList = new ArrayList<Integer>();
        drawableList.add((R.drawable.viva_colombia_1));
        drawableList.add((R.drawable.viva_colombia_2));
        drawableList.add((R.drawable.viva_colombia_3));
        drawableList.add((R.drawable.viva_colombia_4));
        drawableList.add((R.drawable.viva_colombia_5));
        marca.setImagesClue(drawableList);
        this.marcasList.add(marca);


        marca = new Marca();
        marca.setMarcaName("Yanbal");
        drawableList = new ArrayList<Integer>();
        drawableList.add((R.drawable.yanbal_1));
        drawableList.add((R.drawable.yanbal_2));
        drawableList.add((R.drawable.yanbal_3));
        drawableList.add((R.drawable.yanbal_4));
        drawableList.add((R.drawable.yanbal_5));
        marca.setImagesClue(drawableList);
        this.marcasList.add(marca);



    }

    public void updateMarca(Marca marca) {
        int i = 0;
        List<Marca> axu = new ArrayList<Marca>();
        for (Marca m : this.marcasList) {

            if (m.getMarcaName().equals(marca.getMarcaName())) {
                axu.add(marca);
            } else {
                axu.add(marcasList.get(i));
            }
            i++;
        }
        this.marcasList = axu;
    }


}
