package com.example.cap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private FragmentManager fm;
    private FragmentTransaction ft;
    private Main main;
    private List list;
    private Report report;
    private MyReport myReport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavi);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home:
                        setFrag(0);
                        break;
                    case R.id.writing:
                        setFrag(1);
                        break;
                    case R.id.report:
                        setFrag(2);
                        break;
                    case R.id.mreport:
                        setFrag(3);
                        break;
                }

                return true;
            }
        });
        main = new Main();
        list = new List();
        report = new Report();
        myReport = new MyReport();
        setFrag(0); //첫 프래그먼트 화면을 지정한다.
    }

    private void setFrag(int n){      //프래그먼트 교체가 일어나는 실행문
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        switch (n) {
            case 0:
                ft.replace(R.id.main_frame, main);
                ft.commit();
                break;
            case 1:
                ft.replace(R.id.main_frame, list);
                ft.commit();
                break;
            case 2:
                ft.replace(R.id.main_frame, report);
                ft.commit();
                break;
            case 3:
                ft.replace(R.id.main_frame, myReport);
                ft.commit();
                break;
        }
    }
}