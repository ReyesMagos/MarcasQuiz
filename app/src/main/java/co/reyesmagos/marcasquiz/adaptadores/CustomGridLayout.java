package co.reyesmagos.marcasquiz.adaptadores;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

import co.reyesmagos.marcasquiz.R;
import co.reyesmagos.marcasquiz.entities.Marca;

/**
 * Created by oscargallon on 19/12/14.
 */
public class CustomGridLayout extends BaseAdapter {

    private Context context;
    private List<Marca> listMarcas;


    public CustomGridLayout(List<Marca> listMarcas, Context context) {
        this.listMarcas = listMarcas;
        this.context = context;
    }

    @Override
    public int getCount() {
        return this.listMarcas.size();
    }

    @Override
    public Marca getItem(int i) {
        return this.listMarcas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return this.listMarcas.indexOf(getItem(i));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            convertView = inflater.inflate(
                    R.layout.custom_grid_layout, null);

            viewHolder = new ViewHolder();
            viewHolder.imMarca = (ImageView) convertView.findViewById(R.id.im_marca);


            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Marca m = getItem(position);
        if (m.isWasDiscovered())
            viewHolder.imMarca.setImageDrawable(m.getImagesClue().get(0));
        else
            viewHolder.imMarca.setImageDrawable(m.getImagesClue().get(m.getImagesClue().size() - 1));


        return convertView;
    }

    private class ViewHolder {
        ImageView imMarca;
    }
}
