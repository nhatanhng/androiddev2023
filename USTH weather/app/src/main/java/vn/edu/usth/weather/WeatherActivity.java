package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        ForecastFragment firstFragment = new ForecastFragment();

        getSupportFragmentManager().beginTransaction().add(
                R.id.container, firstFragment
        ).commit();

        Log.i("","onCreate() Message on.");

    }
    @Override
    protected void onResume() {
// Always call the superclass method first
        super.onResume();
        Log.i("","onResume() Message on.");

    }
    @Override
    protected void onStart() {
// Always call the superclass method first
        super.onStart();
        Log.i("","onStart() Message on.");

    }
    @Override
    public void onPause() {
// Always call the superclass method first
        super.onPause();
        Log.i("","onPause() Message on.");

    }
    @Override
    public void onStop() {
// Always call the superclass method first
        super.onStop();
        Log.i("","onStop() Message on.");

    }
    @Override
    public void onDestroy() {
// Always call the superclass method first
        super.onDestroy();
        Log.i("","onDestroy() Message on.");

    }
}

