package com.millenniumprogrammers.jesusmaria.agachadito;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecuperarSesionActivity extends AppCompatActivity {

    Button recuperarSesionBtnGo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_sesion);
        recuperarSesionBtnGo = findViewById(R.id.recuperarSesionBtnGo);

        recuperarSesionBtnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RecuperarSesionActivity.this,MainActivity.class));
                finish();
            }
        });
    }
}
