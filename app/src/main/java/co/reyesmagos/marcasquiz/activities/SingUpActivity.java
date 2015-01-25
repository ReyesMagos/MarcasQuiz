package co.reyesmagos.marcasquiz.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import co.reyesmagos.marcasquiz.R;
import co.reyesmagos.marcasquiz.services.PostRestFul;

public class SingUpActivity extends Activity {

    EditText txtName;
    EditText txtLastname;
    EditText txtAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
        init();
    }

    public void init() {
        txtName = (EditText) findViewById(R.id.txt_name);
        txtLastname = (EditText) findViewById(R.id.txt_lastname);
        txtAge = (EditText) findViewById(R.id.txt_age);
    }

    public void singUp(View view) {
        String name = txtName.getText().toString();
        String lastname = txtLastname.getText().toString();
        String age = txtAge.getText().toString();
        PostRestFul postRestFul = new PostRestFul();
        postRestFul.execute(name, lastname, age);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sing_up, menu);
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
