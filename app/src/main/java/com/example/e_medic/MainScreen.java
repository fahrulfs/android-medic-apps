package com.example.e_medic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainScreen extends AppCompatActivity {
    FrameLayout main_frame;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);


        selectedFragment(new Beranda());

        main_frame = findViewById(R.id.main_frame);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId()) {
                    case R.id.beranda:
                        selectedFragment = new Beranda();
                        break;
                    case R.id.catatan:
                        selectedFragment = new Catatan();
                        break;
                    case R.id.pesan:
                        selectedFragment = new Pesan();
                        break;
                    case R.id.akun:
                        selectedFragment = new Akun();
                        break;
                }
                return selectedFragment(selectedFragment);
            }
        });
    }

    private Boolean selectedFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.main_frame, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}

