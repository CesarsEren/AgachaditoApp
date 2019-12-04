package com.millenniumprogrammers.jesusmaria.agachadito;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetView;

public class RegistroActivityP1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_p1);
    }

    /*
    TapTargetView.showFor(this, TapTarget.forToolbarMenuItem(toolbar, R.id.action_search,
    getString("Purbea numero 1"), getString("contenido de prueba"))
            .cancelable(false).tintTarget(true), object : TapTargetView.Listener() {
        override fun onTargetClick(view: TapTargetView) {
            super.onTargetClick(view)
            view.dismiss(true)
        }
    })*/
}
