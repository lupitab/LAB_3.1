package com.example.lupis.lab_31;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button goLogin;
        goLogin = findViewById(R.id.loginBtn);
        final EditText myName;
        final EditText myPassword;
        myName = findViewById(R.id.name);
        myPassword = findViewById(R.id.password);


        goLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (myName.getText().toString().equals("root") && myPassword.getText().toString().equals("root") ){
                    Intent intent = new Intent(MainActivity.this, welcome.class);
                    String userName = myName.getText().toString();
                    String userPassword = myPassword.getText().toString();
                    intent.putExtra("PASS", userPassword);
                    intent.putExtra("NAME", userName);
                    startActivity(intent);
                }
                else
                {
                    Intent intent = new Intent(MainActivity.this, wrong.class);
                    startActivity(intent);
                }
            }
        });



    }
}
