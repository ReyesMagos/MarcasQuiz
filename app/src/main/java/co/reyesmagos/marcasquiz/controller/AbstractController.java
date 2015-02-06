package co.reyesmagos.marcasquiz.controller;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by oscargallon on 5/02/15.
 */
public abstract class AbstractController  {

    private Activity activity;

    public AbstractController(Activity activity) {
        this.activity = activity;
    }

    private void changeActivity(Class<?> destinyClass){
        Intent i = new Intent(getActivity(), destinyClass);
        getActivity().startActivity(i);
    }



    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
