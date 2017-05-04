package com.example.pens.rentcar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_register);
        //getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        final TextView gologin = (TextView) findViewById(R.id.gologin);
        gologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Gologin = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(Gologin);
            }
        });
    }
}
