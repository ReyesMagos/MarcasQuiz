package co.reyesmagos.marcasquiz.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import java.util.ArrayList;

import co.reyesmagos.marcasquiz.R;
import co.reyesmagos.marcasquiz.adaptadores.CustomFilterAdapter;
import co.reyesmagos.marcasquiz.controller.LoginController;

public class LoginActivity extends Activity {

    private AutoCompleteTextView txtEmail;
    private TextView txtPassword;
    private LoginController loginController;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginController= new LoginController(this);
        initComponents();
    }

    private void initComponents(){

        txtEmail = (AutoCompleteTextView ) findViewById(R.id.txt_email);
        txtPassword= (TextView) findViewById(R.id.txt_password);
        ArrayList arraymails = new ArrayList();
        arraymails.add("@gmail.com");
        arraymails.add("@hotmail.com");
        arraymails.add("@yahoo.com");
        arraymails.add("@outlook.com");
        CustomFilterAdapter adapter = new CustomFilterAdapter(this,android.R.layout.simple_list_item_1,arraymails);
        txtEmail.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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

    public void signUp(View view){
        loginController.changeActivity(SingUpActivity.class);
    }
}
