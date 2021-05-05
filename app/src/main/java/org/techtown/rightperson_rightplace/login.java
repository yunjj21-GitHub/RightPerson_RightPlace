package org.techtown.rightperson_rightplace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme); // Splash 화면 구현을 위함

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
