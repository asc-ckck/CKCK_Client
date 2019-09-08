package org.techtown.ckck;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import org.techtown.ckck.MainActivity;

public class SplashActivity extends Activity {
    @Override protected void onCreate(Bundle savedInstance){

        super.onCreate(savedInstance);
        try{
            Thread.sleep(2000);
        }catch(Exception e){
            e.printStackTrace();
        }
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
