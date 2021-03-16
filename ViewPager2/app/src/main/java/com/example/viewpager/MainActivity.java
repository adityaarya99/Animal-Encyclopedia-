package com.example.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.viewpager.R;

public class MainActivity extends AppCompatActivity {

    // creating object of ViewPager
    ViewPager mViewPager;

    //String array
    String[] animals = {String.valueOf(R.string.giraffe), "Tiger", "Elephant", "Bear", "Penguin", "Fox", "Monkey", "Bear"};
    // images array 
    int[] images = {R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4,
            R.drawable.a5, R.drawable.a6, R.drawable.a7, R.drawable.a8};

    // Creating Object of ViewPagerAdapter
    ViewPagerAdapter mViewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing the ViewPager Object 
        mViewPager = (ViewPager) findViewById(R.id.viewPagerMain);


        // Initializing the ViewPagerAdapter
        mViewPagerAdapter = new ViewPagerAdapter(MainActivity.this, images,animals);

        // Adding the Adapter to the ViewPager
        mViewPager.setAdapter(mViewPagerAdapter);
    }
}
