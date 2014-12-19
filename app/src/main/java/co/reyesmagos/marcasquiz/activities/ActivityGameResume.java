package co.reyesmagos.marcasquiz.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import co.reyesmagos.marcasquiz.R;
import co.reyesmagos.marcasquiz.entities.Marca;

/**
 * Created by Alexis-PC on 19/12/2014.
 */
public class ActivityGameResume extends Activity {

    private ImageView imgIcon;
    private TextView marcaName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bono_quiz_resume);
        initComponents();
    }

    public void initComponents() {
        this.imgIcon = (ImageView) super.findViewById(R.id.img_icon_discovered);
        this.marcaName = (TextView) super.findViewById(R.id.txt_name_marca_discovered);

        Intent intent = getIntent();
        Marca marca = (Marca) intent.getSerializableExtra("Marca");
        // this.imgIcon.setImageDrawable(marca.getImagesClue().get(0));
        this.imgIcon.setImageDrawable(getResources().getDrawable(marca.getImagesClue().get(0)));
        this.marcaName.setText(marca.getMarcaName());
    }

    public void onClickGameResume(View view) {

        startActivity(new Intent(this, GridActivity.class));
    }
}
