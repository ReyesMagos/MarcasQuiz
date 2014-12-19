package co.reyesmagos.marcasquiz.entities;

import android.graphics.drawable.Drawable;

import java.util.List;

/**
 * Created by Alexis-PC on 18/12/2014.
 */
public class Marca {

    private String marcaName;
    private List<Drawable> imagesClue;

    public Marca(String marcaName, List<Drawable> imagesClue) {
        this.marcaName = marcaName;
        this.imagesClue = imagesClue;
    }

    public Marca(){

    }

    public String getMarcaName() {
        return marcaName;
    }

    public void setMarcaName(String marcaName) {
        this.marcaName = marcaName;
    }

    public List<Drawable> getImagesClue() {
        return imagesClue;
    }

    public void setImagesClue(List<Drawable> imagesClue) {
        this.imagesClue = imagesClue;
    }
}
