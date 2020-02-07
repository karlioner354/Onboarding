package com.codemybrainsout.onboarding;

import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.codemybrainsout.onboarder.AhoyOnboarderActivity;
import com.codemybrainsout.onboarder.AhoyOnboarderCard;

import java.util.ArrayList;
import java.util.List;

public class ImageBackgroundExampleActivity extends AhoyOnboarderActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AhoyOnboarderCard ahoyOnboarderCard1 = new AhoyOnboarderCard("Bienvenido a Taxi Valle", " Vive una nueva experiencia moviendote con nosotros, solo da click en el boton Solicitar Taxi, escribe una referencia y listo deja que nosotros hagamos el resto.", R.drawable.onboarding1);
        AhoyOnboarderCard ahoyOnboarderCard2 = new AhoyOnboarderCard("Tiempo Real", "Gracias a nuestra tecnologia podras ver a todos los moviles disponibles moviendose cerca de tu ubicación, cuando te hayan aceptado una solicitud podras ver el tiempo estimado de llegada y la trayectoria.", R.drawable.onboarding2);
        AhoyOnboarderCard ahoyOnboarderCard3 = new AhoyOnboarderCard("Chat Hi", "Cuando te hayan aceptado una solicitud de taxi podras comunicarte con el conductor en caso de alguna eventualidad a travez de nuestro Chat Hi, sin salir de la Aplicación.", R.drawable.onboarding3);
        AhoyOnboarderCard ahoyOnboarderCard4 = new AhoyOnboarderCard("Notificaciones", "Nuestra App te mostrara la trayectoria del movil que acepto tu solicitud y te notificara cuando el movil este cerca y cuando haya llegado a tu ubicación.", R.drawable.onboarding4);

        ahoyOnboarderCard1.setBackgroundColor(R.color.black_transparent);
        ahoyOnboarderCard2.setBackgroundColor(R.color.black_transparent);
        ahoyOnboarderCard3.setBackgroundColor(R.color.black_transparent);
        ahoyOnboarderCard4.setBackgroundColor(R.color.black_transparent);

        List<AhoyOnboarderCard> pages = new ArrayList<>();

        pages.add(ahoyOnboarderCard1);
        pages.add(ahoyOnboarderCard2);
        pages.add(ahoyOnboarderCard3);
        pages.add(ahoyOnboarderCard4);

        for (AhoyOnboarderCard page : pages) {
            page.setTitleColor(R.color.white);
            page.setDescriptionColor(R.color.grey_200);
        }

        setFinishButtonTitle("Comencemos");
        showNavigationControls(true);
        setGradientBackground();
        //setImageBackground(R.drawable.download);

        Typeface face = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Light.ttf");
        //setFont(face);

        setInactiveIndicatorColor(R.color.grey_600);
        setActiveIndicatorColor(R.color.white);

        setOnboardPages(pages);

    }
    @Override
    public void onFinishButtonPressed() {
        Toast.makeText(this, "Finish Pressed", Toast.LENGTH_SHORT).show();
    }

}
