package co.reyesmagos.marcasquiz.adaptadores;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import co.reyesmagos.marcasquiz.R;
import co.reyesmagos.marcasquiz.controller.AbstractController;
import co.reyesmagos.marcasquiz.controller.SignUpController;

/**
 * Created by oscargallon on 5/02/15.
 */
public class CustomClearSpinnerAdapter extends BaseAdapter {

    private String[] itemsNameArray;
    private Context context;
    private AbstractController abstractController;

    public CustomClearSpinnerAdapter(String[] itemsNameArray, Context context,AbstractController abstractController) {
        this.itemsNameArray = itemsNameArray;
        this.context = context;
        this.abstractController = abstractController;
    }

    @Override
    public int getCount() {
        return itemsNameArray.length;
    }

    @Override
    public String getItem(int i) {
        return itemsNameArray[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            convertView = inflater.inflate(
                    R.layout.custom_clear_spinner, null);

            viewHolder = new ViewHolder();
            viewHolder.txtItemName = (TextView) convertView.findViewById(R.id.txt_item);
            viewHolder.btnClear=(ImageView) convertView.findViewById(R.id.btn_clear_item);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        String itemName =getItem(position);
        viewHolder.txtItemName.setText(itemName);
        viewHolder.btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(abstractController instanceof SignUpController){
                    SignUpController signUpController = (SignUpController) abstractController;
                    signUpController.clearSpinnerItemSelection();
                }
            }
        });

        return convertView;
    }

    private class ViewHolder{
         TextView txtItemName;
         ImageView btnClear;
    }
}
