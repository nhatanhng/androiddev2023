package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
//import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import android.util.Log;

import com.google.android.material.tabs.TabLayout;

public class WeatherActivity extends AppCompatActivity {
    private TabLayout myTabLayout;
    private ViewPager myViewpager;
    private MyViewPagerAdapter myViewPagerAdapter;


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

        myTabLayout = findViewById(R.id.tab_layout);
        myViewpager = findViewById(R.id.view_pager);
        myViewPagerAdapter = new MyViewPagerAdapter(getSupportFragmentManager(),
                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        myViewpager.setAdapter(myViewPagerAdapter);
        myTabLayout.setupWithViewPager(myViewpager);


//        myViewpager = findViewById(R.id.pager);

//        PagerAdapter adapter = new HomeFragmentPagerAdapter(
//                getSupportFragmentManager());
//        ViewPager pager = (ViewPager) findViewById(R.id.pager);
//        pager.setOffscreenPageLimit(3);
//        pager.setAdapter(adapter);

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

