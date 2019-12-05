package com.millenniumprogrammers.jesusmaria.agachadito;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetSequence;
import com.getkeepsafe.taptargetview.TapTargetView;


public class LoginActivity extends AppCompatActivity {

    Button GoToPrincipalMain;
    TextView GoToCreateAcount,GoToForgotPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        GoToPrincipalMain = findViewById(R.id.btningresar);
        GoToCreateAcount = findViewById(R.id.btnregistrar);
        GoToForgotPassword = findViewById(R.id.recuperarpassword);



        GoToPrincipalMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        });



        GoToCreateAcount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),RegistroActivityP1.class));
            }
        });



        GoToForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),RecuperarContraseniaActivity.class));
            }
        });
    }
}
