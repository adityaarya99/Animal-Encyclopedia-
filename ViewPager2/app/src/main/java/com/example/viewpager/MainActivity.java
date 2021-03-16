package com.example.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // creating object of ViewPager
    ViewPager mViewPager;


    // images array 
    int[] images = {R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4,
            R.drawable.a5, R.drawable.a6, R.drawable.a7, R.drawable.a8};

    // Creating Object of ViewPagerAdapter
    ViewPagerAdapter mViewPagerAdapter;

    public List<String> textAnimals() {

        List<String> animals = new ArrayList<String>();
        animals.add(getString(R.string.giraffe));
        animals.add("Elephant");
        animals.add("Tiger");
        animals.add("Bear");
        animals.add("Fox");
        animals.add("Brat");
        animals.add("Girafee");
        animals.add("Bear");

        return animals;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Initializing the ViewPager Object 
        mViewPager = (ViewPager) findViewById(R.id.viewPagerMain);


        // Initializing the ViewPagerAdapter
        List<String> animals = textAnimals();
        mViewPagerAdapter = new ViewPagerAdapter(MainActivity.this, images, animals);

        // Adding the Adapter to the ViewPager
        mViewPager.setAdapter(mViewPagerAdapter);
    }
}
