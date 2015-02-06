package co.reyesmagos.marcasquiz.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import co.reyesmagos.marcasquiz.R;
import co.reyesmagos.marcasquiz.adaptadores.CustomClearSpinnerAdapter;
import co.reyesmagos.marcasquiz.adaptadores.CustomFilterAdapter;
import co.reyesmagos.marcasquiz.controller.SignUpController;
import co.reyesmagos.marcasquiz.services.PostRestFul;

public class SingUpActivity extends Activity {

    private EditText txtName;
    private EditText txtLastname;
    private EditText txtAge;
    private EditText txtPhone;
    private AutoCompleteTextView txtEmail;
    private EditText txtMobile;
    private Spinner spIdType;
    private EditText txtIdNumber;
    private EditText txtPassword;
    private EditText txtPasswordConfirmation;
    private SignUpController signUpController;
    private String name;
    private String lastname;
    private String age;
    private String phone;
    private String mobile;
    private String idNumber;
    private String idType;
    private String email;
    private String password;
    private String passwordConfirmation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
        signUpController = new SignUpController(this);
        initComponents();
    }

    public void initComponents() {
        txtName = (EditText) findViewById(R.id.txt_name);
        txtLastname = (EditText) findViewById(R.id.txt_lastname);
        txtAge = (EditText) findViewById(R.id.txt_age);
        txtPhone = (EditText) findViewById(R.id.txt_phone);
        txtMobile = (EditText) findViewById(R.id.txt_mobile);
        txtIdNumber = (EditText) findViewById(R.id.txt_id_number);
        spIdType = (Spinner) findViewById(R.id.sp_id_type);
        String[] idTypesArray = getResources().getStringArray(R.array.id_types_array);
        CustomClearSpinnerAdapter customClearSpinnerAdapter = new CustomClearSpinnerAdapter(idTypesArray,
                getApplicationContext(), signUpController);
        spIdType.setAdapter(customClearSpinnerAdapter);

    }

    public void initComponents2() {
        txtEmail = (AutoCompleteTextView) findViewById(R.id.txt_email);
        ArrayList arraymails = new ArrayList();
        arraymails.add("@gmail.com");
        arraymails.add("@hotmail.com");
        arraymails.add("@yahoo.com");
        arraymails.add("@outlook.com");
        CustomFilterAdapter adapter = new CustomFilterAdapter(this, android.R.layout.simple_list_item_1, arraymails);
        txtEmail.setAdapter(adapter);
        txtPassword = (EditText) findViewById(R.id.txt_password);
        txtPasswordConfirmation = (EditText) findViewById(R.id.txt_password_confirmation);
    }


    public void showNextSignUpLayout(View view) {
        name = txtName.getText().toString();
        lastname = txtLastname.getText().toString();
        age = txtAge.getText().toString();
        phone = txtPhone.getText().toString();
        mobile = txtMobile.getText().toString();
        idNumber = txtIdNumber.getText().toString();
        idType = spIdType.getItemAtPosition(spIdType.getSelectedItemPosition()).toString();
        setContentView(R.layout.sign_up_layout2);
        initComponents2();

    }

    public void singUp(View view) {
        email = txtEmail.getText().toString();
        password = txtPassword.getText().toString();
        passwordConfirmation = txtPasswordConfirmation.getText().toString();
        PostRestFul postRestFul = new PostRestFul();
        postRestFul.execute(name, lastname, age, phone, mobile, idType,
                idNumber, email, password, passwordConfirmation);
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

    public EditText getTxtName() {
        return txtName;
    }

    public void setTxtName(EditText txtName) {
        this.txtName = txtName;
    }

    public EditText getTxtLastname() {
        return txtLastname;
    }

    public void setTxtLastname(EditText txtLastname) {
        this.txtLastname = txtLastname;
    }

    public EditText getTxtAge() {
        return txtAge;
    }

    public void setTxtAge(EditText txtAge) {
        this.txtAge = txtAge;
    }

    public EditText getTxtPhone() {
        return txtPhone;
    }

    public void setTxtPhone(EditText txtPhone) {
        this.txtPhone = txtPhone;
    }

    public AutoCompleteTextView getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(AutoCompleteTextView txtEmail) {
        this.txtEmail = txtEmail;
    }

    public EditText getTxtMobile() {
        return txtMobile;
    }

    public void setTxtMobile(EditText txtMobile) {
        this.txtMobile = txtMobile;
    }

    public Spinner getSpIdType() {
        return spIdType;
    }

    public void setSpIdType(Spinner spIdType) {
        this.spIdType = spIdType;
    }

    public EditText getTxtIdNumber() {
        return txtIdNumber;
    }

    public void setTxtIdNumber(EditText txtIdNumber) {
        this.txtIdNumber = txtIdNumber;
    }

    public EditText getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(EditText txtPassword) {
        this.txtPassword = txtPassword;
    }

    public EditText getTxtPasswordConfirmation() {
        return txtPasswordConfirmation;
    }

    public void setTxtPasswordConfirmation(EditText txtPasswordConfirmation) {
        this.txtPasswordConfirmation = txtPasswordConfirmation;
    }

    public SignUpController getSignUpController() {
        return signUpController;
    }

    public void setSignUpController(SignUpController signUpController) {
        this.signUpController = signUpController;
    }
}
