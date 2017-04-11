package com.example.sakar.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText username, password;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        login = (Button)findViewById(R.id.btn);

        username =(EditText)findViewById(R.id.etUser);
        password =(EditText)findViewById(R.id.etPass);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("admin")&&
                        password.getText().toString().equals("admin"))
                {
                    Toast.makeText(LoginActivity.this,"Logging in..."
                            ,Toast.LENGTH_SHORT).show();

                    i = new Intent(getApplicationContext(), GridviewActivity.class);
                    startActivity(i);


                }

                else{
                    Toast.makeText(getApplicationContext(), "Invalid Login...",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
