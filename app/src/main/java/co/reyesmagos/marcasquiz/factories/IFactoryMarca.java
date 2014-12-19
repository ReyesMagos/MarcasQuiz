package co.reyesmagos.marcasquiz.factories;

import java.util.List;

import co.reyesmagos.marcasquiz.entities.Marca;
import co.reyesmagos.marcasquiz.factories.impl.FactoryMarca;

/**
 * Created by oscargallon on 19/12/14.
 */
public interface IFactoryMarca {

    public List<Marca> getMarcaList();

    public void createMarcas();



}
