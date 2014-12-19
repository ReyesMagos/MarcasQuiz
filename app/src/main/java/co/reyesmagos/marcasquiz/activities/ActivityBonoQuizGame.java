package co.reyesmagos.marcasquiz.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import co.reyesmagos.marcasquiz.R;
import co.reyesmagos.marcasquiz.controller.GameController;
import co.reyesmagos.marcasquiz.entities.Marca;
import co.reyesmagos.marcasquiz.mocks.MarcasFactory;


public class ActivityBonoQuizGame extends Activity{

    //private Chronometer timeChronometer;
    private TextView timeTxt;
    private ImageView iconMarca;
    private EditText nameIngressedTxt;
    private ImageView btnCompare;
    private static int numOptions;
    private Marca marca;
    private GameController gameController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bono_quiz_game);
        initComponents();
    }

    public void initComponents() {
        // this.timeChronometer = (Chronometer)super.findViewById(R.id.chronometer_time);
        this.timeTxt = (TextView) super.findViewById(R.id.txt_time_countdown);
        setCountDownTimer(40000, 1000);
        this.iconMarca = (ImageView) super.findViewById(R.id.marca_image_view);
        this.nameIngressedTxt = (EditText) super.findViewById(R.id.editText);
        this.btnCompare = (ImageView) super.findViewById(R.id.imageView);
        numOptions = 4;



        marca =(Marca) getIntent().getSerializableExtra("Marca");

        this.gameController = new GameController(this, marca);
        this.iconMarca.setImageDrawable(getResources().getDrawable(marca.getImagesClue().get(4)));


    }

    @Override
    protected void onStart() {

        //this.timeChronometer.start();
        super.onStart();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void setCountDownTimer(long millinInFuture, final long countdownInterval) {
        CountDownTimer countDownTimer = new CountDownTimer(millinInFuture, countdownInterval) {
            @Override
            public void onTick(long l) {
                timeTxt.setText("" + l / countdownInterval);
            }

            @Override
            public void onFinish() {
                numOptions--;
                if(numOptions != -1){
                    iconMarca.setImageDrawable(getResources().getDrawable(marca.getImagesClue()
                            .get(numOptions)));
                    setCountDownTimer(30000, 1000);
                }else{
                    timeTxt.setText("Ganó");
                    Intent i = new Intent(getApplicationContext(), ActivityGameResume.class);
                    i.putExtra("Marca", marca);
                    numOptions = 0;
                    marca.setWasDiscovered(true);
                    startActivity(i);
                }
            }
        }.start();

    }

    public void onCompareNameClick(View view) {
        String nameIngressed = nameIngressedTxt.getText().toString();
        if (!gameController.compareNames(marca, nameIngressed)) {
            numOptions--;
            if (numOptions != -1) {

                this.iconMarca.setImageDrawable(getResources().getDrawable(marca.getImagesClue()
                        .get(numOptions)));
            } else {

                Toast.makeText(this, "Felicidades ganó", Toast.LENGTH_LONG).show();
                Intent i = new Intent(this, ActivityGameResume.class);
                i.putExtra("Marca", marca);
                numOptions = 0;
                marca.setWasDiscovered(true);
                startActivity(i);
            }
        } else {
            Toast.makeText(this, "Felicidades ganó", Toast.LENGTH_LONG).show();
            Intent i = new Intent(this, ActivityGameResume.class);
            i.putExtra("Marca", marca);
            marca.setWasDiscovered(true);
            startActivity(i);
        }

    }


}
