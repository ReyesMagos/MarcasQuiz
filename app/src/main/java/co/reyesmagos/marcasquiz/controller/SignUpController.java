package co.reyesmagos.marcasquiz.controller;

import android.app.Activity;
import android.text.TextUtils;
import android.webkit.URLUtil;

import co.reyesmagos.marcasquiz.R;
import co.reyesmagos.marcasquiz.activities.LoginActivity;
import co.reyesmagos.marcasquiz.activities.SignUpActivity;
import co.reyesmagos.marcasquiz.services.PostRestFul;

/**
 * Created by oscargallon on 5/02/15.
 */
public class SignUpController extends  AbstractController {


    public SignUpController(Activity activity) {
        super(activity);
    }

    public void clearSpinnerItemSelection(){
        SignUpActivity singUpActivity= (SignUpActivity)getActivity();
        singUpActivity.getSpIdType().setSelection(0);
    }



    public void singUp(String name, String lastname, String age,String phone, String mobile,
                       String idType, String idNumber, String email, String password,
                       String passwordConfirmation){
        SignUpActivity signUpActivity = (SignUpActivity) getActivity();


        if(TextUtils.isEmpty(name)|| name.length()<4){
            showAlertDialog(getActivity().getResources().getString(R.string.error_label),
                    "El Nombre es un campo obligatorio y " +
                    "debe ser minimo de 4 letras");
            signUpActivity.changeToLayoutOne();
            signUpActivity.getTxtName().requestFocus();
            return;


        }
        if(TextUtils.isEmpty(lastname) || lastname.length()<4){
            showAlertDialog(getActivity().getResources().getString(R.string.error_label),
                    "El Apellido es un campo obligatorio y " +
                            "debe ser minimo de 4 letras");
            signUpActivity.changeToLayoutOne();
            signUpActivity.getTxtLastname().requestFocus();
            return;
        }
        if(TextUtils.isEmpty(age) || !TextUtils.isDigitsOnly(age)){
            showAlertDialog(getActivity().getResources().getString(R.string.error_label),
                    "Debe ingresar su Edad y  " +
                            "esta solo debe contener numero ");
            signUpActivity.changeToLayoutOne();
            signUpActivity.getTxtAge().requestFocus();
            return;
        }

        if(TextUtils.isEmpty(phone) || !TextUtils.isDigitsOnly(phone)){
            showAlertDialog(getActivity().getResources().getString(R.string.error_label),
                    "Debe ingresar su Telefono y  " +
                            "esta solo debe contener numero ");
            signUpActivity.changeToLayoutOne();
            signUpActivity.getTxtPhone().requestFocus();
            return;
        }


        if(TextUtils.isEmpty(mobile) || !TextUtils.isDigitsOnly(mobile)){
            showAlertDialog(getActivity().getResources().getString(R.string.error_label),
                    "Debe ingresar su Celuar y  " +
                            "esta solo debe contener numero ");
            signUpActivity.changeToLayoutOne();
            signUpActivity.getTxtMobile().requestFocus();
            return;
        }

        if(TextUtils.isEmpty(idNumber) || !TextUtils.isDigitsOnly(idNumber)){
            showAlertDialog(getActivity().getResources().getString(R.string.error_label),
                    "Debe ingresar su Numero de Indentificacion y  " +
                            "esta solo debe contener numero ");
            signUpActivity.changeToLayoutOne();
            signUpActivity.getTxtIdNumber().requestFocus();
            return;
        }

        if(TextUtils.isEmpty(email)){
            showAlertDialog(getActivity().getResources().getString(R.string.error_label),
                    "Debe ingresar su Email");
            signUpActivity.getTxtEmail().requestFocus();
            return;
        }

        if(TextUtils.isEmpty(password)|| password.length()<6){
            showAlertDialog(getActivity().getResources().getString(R.string.error_label),
                    "Debe ingresar su Contraseña y esta debe ser mayor de 5 Caracteres");
            signUpActivity.getTxtPassword().requestFocus();
            return;
        }

        if(TextUtils.isEmpty(passwordConfirmation)|| passwordConfirmation.length()<6){
            showAlertDialog(getActivity().getResources().getString(R.string.error_label),
                    "Debe ingresar la Confirmacion de  Contraseña y esta debe ser mayor de 5" +
                            " Caracteres");
            signUpActivity.getTxtPasswordConfirmation().requestFocus();
            return;
        }
        showProgressdialog("Registrando", "Espere Por Favor", false);

        PostRestFul postRestFul = new PostRestFul(this);
        postRestFul.execute(name, lastname, age, phone, mobile, idType,
                idNumber, email, password, passwordConfirmation);
    }

    public void processSignUpResponse(boolean hasSuccess){
        if(hasSuccess){
            showAlertDialog("Exito", "Ahora se Encuntra Registrado En el Sistema");
        }else{
            showAlertDialog(getActivity().getResources().getString(R.string.error_label),
                    "Ahora se Encuntra Registrado En el Sistema");
        }
        dissmissProgressDialog();
        changeActivity(LoginActivity.class);

    }
}
