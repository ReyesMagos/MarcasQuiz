package co.reyesmagos.marcasquiz.controller;

import android.app.Activity;
import android.text.TextUtils;

import co.reyesmagos.marcasquiz.R;
import co.reyesmagos.marcasquiz.activities.LoginActivity;
import co.reyesmagos.marcasquiz.services.LoginRestful;

/**
 * Created by oscargallon on 5/02/15.
 */
public class LoginController extends AbstractController {

    public LoginController(Activity activity) {
        super(activity);
    }

    public void logIn(String email, String password){
        LoginActivity loginActivity = (LoginActivity) getActivity();
        if(TextUtils.isEmpty(email)){
            showAlertDialog(getActivity().getResources().getString(R.string.error_label),
                    "Debe Ingresar Su Email");
            loginActivity.getTxtEmail().requestFocus();
            return;
        }
        if(TextUtils.isEmpty(password)){
            showAlertDialog(getActivity().getResources().getString(R.string.error_label),
                    "Debe Ingresar Su Contraseña");
            loginActivity.getTxtPassword().requestFocus();
            return;
        }

        showProgressdialog("Iniciando Sesion", "Espere Por Favor", false);
        LoginRestful loginRestful = new LoginRestful(this);
        loginRestful.execute(email, password);

    }

    public void processRestFulResponse(boolean success,String responseRestFul){
        dissmissProgressDialog();
        if(success){

            showAlertDialog("Alerta",responseRestFul);
        }else{
            showAlertDialog(getActivity().getResources().getString(R.string.error_label),
                    "Ocurrio Un Error");
        }
    }
}
