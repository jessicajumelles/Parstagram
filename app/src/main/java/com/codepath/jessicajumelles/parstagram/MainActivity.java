package com.codepath.jessicajumelles.parstagram;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.codepath.jessicajumelles.parstagram.fragments.ComposeFragment;
import com.codepath.jessicajumelles.parstagram.fragments.PostFragment;
import com.codepath.jessicajumelles.parstagram.fragments.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    final FragmentManager fragmentManager = getSupportFragmentManager();
    private BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                Fragment fragment;
                    switch (menuItem.getItemId()) {

                    case R.id.action_home:
                        fragment = new PostFragment();
                        break;
                        //Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                    case R.id.action_compose:
                        fragment = new ComposeFragment();
                        break;
                        // Toast.makeText(MainActivity.this, "Compose", Toast.LENGTH_SHORT).show();
                    case R.id.action_profile:
                        fragment = new ProfileFragment();

                    default:
                        //TODO: update fragment
                     //   Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                        fragment = new ProfileFragment();
                        break;
                }
                fragmentManager.beginTransaction().replace(R.id.flContainer, fragment).commit();
                return true;
            }
        });
        //set default selection
        bottomNavigationView.setSelectedItemId(R.id.action_home);

    }

}