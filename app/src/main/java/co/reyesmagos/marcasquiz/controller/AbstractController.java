package co.reyesmagos.marcasquiz.controller;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;

import co.reyesmagos.marcasquiz.R;

/**
 * Created by oscargallon on 5/02/15.
 */
public abstract class AbstractController {

    private Activity activity;
    private ProgressDialog progressDialog;

    public AbstractController(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity(Class<?> destinyClass) {
        Intent i = new Intent(getActivity(), destinyClass);
        getActivity().startActivity(i);
    }

    public void showProgressdialog(String title, String message, Boolean isCancelable) {
        progressDialog = new ProgressDialog(getActivity());
        progressDialog.setTitle(title);
        progressDialog.setMessage(message);
        progressDialog.setCancelable(isCancelable);
        progressDialog.show();

    }

    public void dissmissProgressDialog() {
        progressDialog.dismiss();
    }

    public void showAlertDialog(String title, String message) {
        AlertDialog alertDialog = new AlertDialog.Builder(getActivity())
                .setTitle(title).setMessage(message)
                .setPositiveButton(R.string.acept_label, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                }).show();

    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
