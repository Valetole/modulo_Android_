package cl.valentina.miapp.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import cl.valentina.miapp.R;


public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        Animation animacionSplashScreen1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation animacionSplashScreen2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);

        TextView titulo_app= findViewById(R.id.tituloAppTextView);
        ImageView logo_app= findViewById(R.id.logoImageView);

        titulo_app.setAnimation(animacionSplashScreen2);
        logo_app.setAnimation(animacionSplashScreen1);

        new Handler().postDelayed (new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 4000);
    }
}