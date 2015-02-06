package co.reyesmagos.marcasquiz.controller;

import android.app.Activity;

import co.reyesmagos.marcasquiz.activities.SingUpActivity;

/**
 * Created by oscargallon on 5/02/15.
 */
public class SignUpController extends  AbstractController {


    public SignUpController(Activity activity) {
        super(activity);
    }

    public void clearSpinnerItemSelection(){
        SingUpActivity singUpActivity= (SingUpActivity)getActivity();
        singUpActivity.getSpIdType().setSelection(0);
    }
}
