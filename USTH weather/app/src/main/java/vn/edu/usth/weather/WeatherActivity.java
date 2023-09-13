package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import android.util.Log;

public class WeatherActivity extends AppCompatActivity {
    private ViewPager myViewpager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        ForecastFragment firstFragment = new ForecastFragment();

        getSupportFragmentManager().beginTransaction().add(
                R.id.container, firstFragment
        ).commit();

        Log.i("","onCreate() Message on.");

        WeatherFragment secondFragment = new WeatherFragment();
        getSupportFragmentManager().beginTransaction().add(
                R.id.container, secondFragment
        ).commit();

        myViewpager = findViewById(R.id.pager);
        HomeFragmentPagerAdapter homeFragmentPagerAdapter = new HomeFragmentPagerAdapter(getSupportFragmentManager(),
                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        myViewpager.setOffscreenPageLimit(3);
        myViewpager.setAdapter(homeFragmentPagerAdapter);
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

