package co.reyesmagos.marcasquiz.entities;

import android.graphics.drawable.Drawable;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Alexis-PC on 18/12/2014.
 */
public class Marca implements Serializable {


    private static final long serialVersionUID = 1L;

    private String marcaName;
    private List<Integer> imagesClue;
    private boolean wasDiscovered;

    public Marca(String marcaName, List<Integer> imagesClue) {
        this.marcaName = marcaName;
        this.imagesClue = imagesClue;
        this.wasDiscovered = false;
    }

    public Marca() {

    }

    public String getMarcaName() {
        return marcaName;
    }

    public void setMarcaName(String marcaName) {
        this.marcaName = marcaName;
    }

    public List<Integer> getImagesClue() {
        return imagesClue;
    }

    public void setImagesClue(List<Integer> imagesClue) {
        this.imagesClue = imagesClue;
    }

    public boolean isWasDiscovered() {
        return wasDiscovered;
    }

    public void setWasDiscovered(boolean wasDiscovered) {
        this.wasDiscovered = wasDiscovered;
    }
}
