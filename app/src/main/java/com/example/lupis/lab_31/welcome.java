package com.example.lupis.lab_31;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        TextView nameBox;
        TextView passBox;
        nameBox = findViewById(R.id.nameTxt);
        passBox = findViewById(R.id.passTxt);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if(extras != null)
        {
            String extra_Name = extras.getString("NAME");
            nameBox.setText(extra_Name);
            String extra_Password = extras.getString("PASS");
            passBox.setText((extra_Password));
        }

        Context context;
        context = getApplicationContext();
        Toast myToast = new Toast(context);
        myToast.makeText(context, "Password OK!!",
                Toast.LENGTH_LONG).show();


    }
}
