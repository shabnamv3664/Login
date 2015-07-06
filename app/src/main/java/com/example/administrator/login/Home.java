package com.example.administrator.login;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Administrator on 6/24/2015.
 */
public class Home extends Activity {
    EditText uname, pass;
    String username, password;
   // SharedPreferences sh_Pref;
   // SharedPreferences.Editor toEdit;
//public SharedPreferences.Editor sp;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_xml);
          uname = (EditText) findViewById(R.id.editText);
         pass = (EditText) findViewById(R.id.editText2);
      //  sh_Pref = getSharedPreferences("Login Credentials", MODE_PRIVATE);
       

      //uname.setText(sh_Pref.getString("username", username));
     // pass.setText( sh_Pref.getString("password",password));



    }


}
