package com.example.pens.rentcar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private String url = "http://ip/android/login.php";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);


        final Button masuk = (Button)findViewById(R.id.masuk);

        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                url="http://agusharyanto.net/android/login.php";
//                url +="?user="+txtUser.getText().toString()+"&password="+txtPassword.getText().toString();
//                getRequest(txtStatus,url);

                Intent login = new Intent(LoginActivity.this, UserHomeActivity.class);
                startActivity(login);
            }
        });

        final TextView regist = (TextView) findViewById(R.id.regist);
        regist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent register = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(register);
            }
        });
    }
}
