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

    private MarcasFactory instance;
    private List<Marca> marcasList;
    Context context;

    private MarcasFactory(Context context){
        super();
        this.context = context;

    }

    public static List<Marca> getInstance(Context context){
        List<Marca> listMarca = new ArrayList<Marca>();

        Marca marca = new Marca();
        marca.setMarcaName("Exito");
        List<Drawable>drawableList = new ArrayList<Drawable>();
        drawableList.add(context.getResources().getDrawable(R.drawable.exito_1));
        drawableList.add(context.getResources().getDrawable(R.drawable.exito_2));
        drawableList.add(context.getResources().getDrawable(R.drawable.exito_3));
        drawableList.add(context.getResources().getDrawable(R.drawable.exito_4));
        drawableList.add(context.getResources().getDrawable(R.drawable.exito_5));
        marca.setImagesClue(drawableList);

        listMarca.add(marca);

        return listMarca;
    }




}
