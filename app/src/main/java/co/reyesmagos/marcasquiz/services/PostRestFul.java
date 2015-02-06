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



/**
 * Created by oscargallon on 24/01/15.
 */
public class PostRestFul extends AsyncTask<String,String, Boolean>{



    @Override
    protected Boolean doInBackground(String... strings) {
        String urlString = "http://69.50.211.15:1337/user/create/";
        Log.i("Entre","Realizare un post");
        try
        {
            HttpClient client = new DefaultHttpClient();
            HttpPost post = new HttpPost(urlString);

            MultipartEntity reqEntity = new MultipartEntity();
            reqEntity.addPart("name", new StringBody(strings[0]));
            reqEntity.addPart("lastname", new StringBody(strings[1]));
            reqEntity.addPart("age", new StringBody(strings[2]));
            post.setEntity(reqEntity);
            HttpResponse response = client.execute(post);
            HttpEntity resEntity = response.getEntity();
            final String response_str = EntityUtils.toString(resEntity);
            if (resEntity != null) {
                Log.i("RESPONSE", response_str);

            }else{
                Log.i("RESPONSE ERROR", response_str);
            }
        }
        catch (Exception ex){
            Log.e("Debug", "error: " + ex.getMessage(), ex);
        }
        return null;
    }
}