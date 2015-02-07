package co.reyesmagos.marcasquiz.services;

import android.os.AsyncTask;
import android.util.Log;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import co.reyesmagos.marcasquiz.activities.LoginActivity;
import co.reyesmagos.marcasquiz.controller.AbstractController;
import co.reyesmagos.marcasquiz.controller.LoginController;

/**
 * Created by oscargallon on 7/02/15.
 */
public class LoginRestful extends AsyncTask<String, String, Boolean> {

    private AbstractController abstractController;
    private String responseRestFul;

    public LoginRestful(AbstractController abstractController) {
        this.abstractController = abstractController;
    }

    @Override
    protected Boolean doInBackground(String... strings) {
        String urlString = "http://69.50.211.15:1337/session/process/";
        Log.i("Entre", "me registrare");
        try
        {
            HttpClient client = new DefaultHttpClient();
            HttpPost post = new HttpPost(urlString);

            MultipartEntity reqEntity = new MultipartEntity();
            reqEntity.addPart("username", new StringBody(strings[0]));
            reqEntity.addPart("password", new StringBody(strings[1]));
            post.setEntity(reqEntity);
            HttpResponse response = client.execute(post);
            HttpEntity resEntity = response.getEntity();
            final String response_str = EntityUtils.toString(resEntity);
            responseRestFul = response_str;
            if (resEntity != null) {
                Log.i("RESPONSE", response_str);

            }else{
                Log.i("RESPONSE ERROR", response_str);
            }
        }
        catch (Exception ex){
            Log.e("Debug", "error: " + ex.getMessage(), ex);
            return false;
        }
        return true;
    }

    @Override
    protected void onPostExecute(Boolean aBoolean) {
        super.onPostExecute(aBoolean);

            if(abstractController instanceof LoginController){
                LoginController loginController =(LoginController) abstractController;
                loginController.processRestFulResponse(aBoolean, responseRestFul);
            }


    }
}
