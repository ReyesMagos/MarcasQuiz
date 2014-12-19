package co.reyesmagos.marcasquiz.activities;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import co.reyesmagos.marcasquiz.R;
import co.reyesmagos.marcasquiz.entities.Marca;
import co.reyesmagos.marcasquiz.mocks.MarcasFactory;


public class ActivityBonoQuizGame extends Activity {

    //private Chronometer timeChronometer;
    private TextView timeTxt;
    private ImageView iconMarca;
    private EditText nameIngressedTxt;
    private ImageView btnCompare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bono_quiz_game);
        initComponents();
    }

    public void initComponents(){
       // this.timeChronometer = (Chronometer)super.findViewById(R.id.chronometer_time);
        this.timeTxt = (TextView)super.findViewById(R.id.txt_time_countdown);
        setCountDownTimer(40000, 1000);
        this.iconMarca = (ImageView)super.findViewById(R.id.marca_image_view);
        this.nameIngressedTxt = (EditText)super.findViewById(R.id.editText);
        this.btnCompare = (ImageView)super.findViewById(R.id.imageView);

        Marca marca = MarcasFactory.getInstance(this).get(0);

        this.iconMarca.setImageDrawable(marca.getImagesClue().get(4));

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

    public void setCountDownTimer(long millinInFuture, final long countdownInterval){
        CountDownTimer countDownTimer = new CountDownTimer(millinInFuture, countdownInterval) {
            @Override
            public void onTick(long l) {
                timeTxt.setText("" + l / countdownInterval);
            }

            @Override
            public void onFinish() {
                timeTxt.setText("Perdiste");

            }
        }.start();

    }


}
