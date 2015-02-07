package co.reyesmagos.marcasquiz.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import co.reyesmagos.marcasquiz.R;
import co.reyesmagos.marcasquiz.adaptadores.CustomGridLayout;
import co.reyesmagos.marcasquiz.entities.Marca;
import co.reyesmagos.marcasquiz.mocks.MarcasFactory;
import co.reyesmagos.marcasquiz.services.PostRestFul;

public class GridActivity extends Activity {

    private GridView gridMarcas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        if(MarcasFactory.getInstance().getMarcasList()==null)
        MarcasFactory.getInstance().createMarca();
        init();
        //PostRestFul postRestFul = new PostRestFul();
        //postRestFul.execute();
    }

    public void init() {
        gridMarcas = (GridView) findViewById(R.id.grid_marcas);
        CustomGridLayout customGridLayout = new CustomGridLayout(MarcasFactory.getInstance().getMarcasList(),
                getApplicationContext());
        gridMarcas.setAdapter(customGridLayout);
        gridMarcas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Marca marca = (Marca) adapterView.getAdapter().getItem(i);
                if (!marca.isWasDiscovered()) {
                    Intent intent = new Intent(getApplicationContext(), ActivityBonoQuizGame.class);
                    intent.putExtra("Marca", marca);
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        updateGrid();

    }

    public void updateGrid(){
        CustomGridLayout customGridLayout = new CustomGridLayout(MarcasFactory.getInstance().getMarcasList(),
                getApplicationContext());
        gridMarcas.setAdapter(customGridLayout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_grid, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
