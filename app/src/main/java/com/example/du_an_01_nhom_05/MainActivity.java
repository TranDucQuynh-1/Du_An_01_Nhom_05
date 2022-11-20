package com.example.du_an_01_nhom_05;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.du_an_01_nhom_05.Fragment.BookFragment;
import com.example.du_an_01_nhom_05.Fragment.HomeFragment;
import com.example.du_an_01_nhom_05.Fragment.RankFragment;
import com.example.du_an_01_nhom_05.Fragment.UserFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        BottomNavigationView view = findViewById(R.id.bottom_nav);
        HomeFragment hf = new HomeFragment();
        replaceFrg(hf);
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        HomeFragment hf = new HomeFragment();
                        replaceFrg(hf);
                        break;
                    case R.id.book:
                        BookFragment bf = new BookFragment();
                        replaceFrg(bf);
                        break;
                    case R.id.user:
                        UserFragment uf = new UserFragment();
                        replaceFrg(uf);
                        break;
                    case R.id.rank:
                        RankFragment rf = new RankFragment();
                        replaceFrg(rf);
                        break;
                }
                return true;
            }
        });
    }

    public void replaceFrg(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).commit();
    }
}