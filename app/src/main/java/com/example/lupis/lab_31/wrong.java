package com.example.lupis.lab_31;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class wrong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong);

        AlertDialog.Builder DialogConf = new AlertDialog.Builder(this);
        DialogConf.setTitle("Alert");
        DialogConf.setMessage("Password not OK");
        DialogConf.setIcon(R.mipmap.ic_launcher);

        DialogConf.setNeutralButton("OK",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
        AlertDialog MyDialog = DialogConf.create();
        MyDialog.show();
    }
}
