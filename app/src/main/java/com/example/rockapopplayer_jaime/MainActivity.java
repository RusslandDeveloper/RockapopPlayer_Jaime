package com.example.rockapopplayer_jaime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;


public class MainActivity extends AppCompatActivity {




    // Main Variables for the adapter
    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);

        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new RockFragment(), "Rock");
        adapter.addFragment(new ClassicFragment(), "Classic");
        adapter.addFragment(new PopFragment(), "Pop");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        setIcons();


    }


    private void setIcons(){

        int[] tabIcons = {

                R.drawable.ic_rockmusic,
                R.drawable.ic_lyre,
                R.drawable.ic_hopmusic
        };

        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);

    }
}
