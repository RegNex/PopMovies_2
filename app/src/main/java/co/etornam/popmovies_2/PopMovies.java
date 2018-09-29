package co.etornam.popmovies_2;

import android.app.Application;

import co.etornam.popmovies_2.utils.FontOverride;

public class PopMovies extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        new Thread(new Runnable() {
            @Override
            public void run() {
                FontOverride.setDefaultFont(PopMovies.this, "DEFAULT", "Comfortaa-Light.ttf");
                FontOverride.setDefaultFont(PopMovies.this, "MONOSPACE", "Comfortaa-Regular.ttf");
                FontOverride.setDefaultFont(PopMovies.this, "SERIF", "Comfortaa-Bold.ttf");
                FontOverride.setDefaultFont(PopMovies.this, "SANS_SERIF", "Comfortaa-Bold.ttf");
            }
        }).start();
    }
}
