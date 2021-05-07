package org.techtown.rightperson_rightplace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme); // Splash 화면 구현을 위함

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button loginBtn = (Button)findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) { // 로그인 버튼을 누르면 토스트 메세지를 띄우며 홈화면으로 이동
                Intent intent = new Intent(getApplicationContext(), Home.class);
                startActivity(intent);

                Toast toast = Toast.makeText(getApplicationContext(), "성공적으로 로그인 되었습니다.", Toast.LENGTH_SHORT);
                toast.show();

                finish();
            }
        });

        Button joinBtn = (Button)findViewById(R.id.joinBtn);
        joinBtn.setOnClickListener(new View.OnClickListener() { // 회원가입 버튼을 누르면 회원가입화면으로 이동
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Join_membership.class);
                startActivity(intent);
            }
        });
    }
}
