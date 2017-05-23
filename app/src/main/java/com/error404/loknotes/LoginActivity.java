package com.error404.loknotes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText lgUsername, lgPassword;
    Button lgLogin, lgRemember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().setTitle("Login");
        lgUsername = (EditText) findViewById(R.id.lg_username);
        lgPassword = (EditText) findViewById(R.id.lg_password);
        lgLogin = (Button) findViewById(R.id.lg_login);
        lgRemember = (Button) findViewById(R.id.lg_remember);

        lgLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lgUsername.getText().toString().equals(" " ) ||
                        lgPassword.getText().toString().equals(" ")){

                    Toast.makeText(getApplicationContext(),"Harap Diisi Dengan Benar",
                            Toast.LENGTH_SHORT).show();

                } else if (lgUsername.getText().toString().equals("admin") &&
                        lgPassword.getText().toString().equals("admin")) {

                    Intent newIntent = new Intent(getApplicationContext(),ListActivity.class);
                    startActivity(newIntent);

                    Toast.makeText(getApplicationContext(),"Selamat Datang",
                            Toast.LENGTH_SHORT).show();

                } else {

                    Toast.makeText(getApplicationContext(),"Harap Diisi Dengan Benar",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
