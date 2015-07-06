package com.example.administrator.login;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import javax.security.auth.login.LoginException;


public class log extends Activity implements View.OnClickListener{

    Button submit;
    EditText uname, pass;
    String username, password;
  //  SharedPreferences sh_Pref;
  //  SharedPreferences.Editor toEdit;

    boolean valid=false;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        uname = (EditText) findViewById(R.id.editText);
        pass = (EditText) findViewById(R.id.editText2);
        submit = (Button) findViewById(R.id.button);
         submit.setOnClickListener(this);


    }

  /*  public void sharedPrefernces() {
       sh_Pref = getSharedPreferences("Login Credentials", MODE_PRIVATE);
        toEdit = sh_Pref.edit();
        toEdit.putString("username", username);
        toEdit.putString("password", password);
        toEdit.commit();

*/


    public void onClick(View currentButton) {


        try {


            if (uname != null && pass != null && pass.length() > 5)
            {
                DBUserAdapter dbUser = new DBUserAdapter(log.this);
                dbUser.open();
                valid = true;
            } else{
                Toast.makeText(getApplicationContext(),
                        "Enter valid data", Toast.LENGTH_LONG).show();


            }


            if (valid == true) {
                Intent i = new Intent(log.this, Home.class);
                startActivity(i);
                finish();
            }
        } catch (Exception e)
        else{
            Toast.makeText(getApplicationContext(),
                    "Enter valid data", Toast.LENGTH_LONG).show();


        }


        username = uname.getText().toString();
        password = pass.getText().toString();

     //   sharedPrefernces();




        }




}