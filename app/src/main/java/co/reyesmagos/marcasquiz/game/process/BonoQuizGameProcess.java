package co.reyesmagos.marcasquiz.game.process;

import android.graphics.drawable.Drawable;

import co.reyesmagos.marcasquiz.entities.Marca;

/**
 * Created by Alexis-PC on 18/12/2014.
 */
public class BonoQuizGameProcess {

    private int gameStatus;

    public BonoQuizGameProcess() {
        super();
    }

    public boolean verifyName(Marca marca, String nameIngressed) {
        boolean nameEquals = false;

        if (marca.getMarcaName().equalsIgnoreCase(nameIngressed)) {
            nameEquals = true;
        }

        return nameEquals;
    }

    public Drawable getImageClue(Marca marca, int oportunity) {
        switch (oportunity) {
            case 0:
                return marca.getImagesClue().get(4);

            case 1:
                return marca.getImagesClue().get(3);

            case 2:
                return marca.getImagesClue().get(2);

            case 3:
                return marca.getImagesClue().get(1);

            case 4:
                return marca.getImagesClue().get(0);

        }
        return null;
    }


}
