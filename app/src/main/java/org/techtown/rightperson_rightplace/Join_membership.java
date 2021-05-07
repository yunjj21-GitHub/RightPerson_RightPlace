package org.techtown.rightperson_rightplace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Join_membership extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join_membership);

        final Button finishBtn = (Button)findViewById(R.id.finishBtn);
        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // 회원가입 버튼을 누르면 토스트 메세지를 띄우며 로그인 화면으로 돌아감
                onBackPressed(); // 이전화면으로 돌아감

                Toast toast = Toast.makeText(getApplicationContext(), "회원가입이 완료되었습니다.", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button cancelBtn = (Button)findViewById(R.id.cancelBtn);
        cancelBtn.setOnClickListener(new View.OnClickListener() { // 취소버튼 누르면 이전화면으로 돌아감
            @Override
            public void onClick(View v) {
                onBackPressed(); // 이전화면으로 돌아감
            }
        });
    }
}
