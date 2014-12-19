package co.reyesmagos.marcasquiz.controller;

import android.content.Context;

import co.reyesmagos.marcasquiz.entities.Marca;
import co.reyesmagos.marcasquiz.game.process.BonoQuizGameProcess;

/**
 * Created by Alexis-PC on 18/12/2014.
 */
public class GameController {

    private Context context;
    private BonoQuizGameProcess bonoQuizGameProcess;
    private Marca marcaSelected;

    public GameController(Context context, Marca marca) {
        super();
        this.context = context;
        this.bonoQuizGameProcess = new BonoQuizGameProcess();
        this.marcaSelected = marca;
    }

    public boolean compareNames(Marca marca, String nameIngressed) {
        boolean isEqual = bonoQuizGameProcess.verifyName(marca, nameIngressed);

        return isEqual;
    }


}
