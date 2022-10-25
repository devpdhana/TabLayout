package com.dhana.tablayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    LinearLayout Signup;
    LinearLayout Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.Tablayout);
        Signup = findViewById(R.id.Signup);
        Login = findViewById(R.id.Login);

        tabLayout.addTab(tabLayout.newTab().setText("Sign up"));
        tabLayout.addTab(tabLayout.newTab().setText("Log in"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()){
                    case 0:
                        setVisible(Signup,Login);
                        break;
                    case 1:
                        setVisible(Login,Signup);
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setVisible(LinearLayout signup, LinearLayout login) {
        signup.setVisibility(Signup.VISIBLE);
        login.setVisibility(Login.GONE);
    }
}