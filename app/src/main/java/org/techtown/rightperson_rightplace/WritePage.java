package org.techtown.rightperson_rightplace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class WritePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.write_page);

        // 좌측 상단에 뒤로가기 버튼을 누르면 이전 액티비티로 돌아감
        Button gobackBtn = (Button)findViewById(R.id.gobackBtn);
        gobackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        // 맨 하단의 글 등록하기 버튼을 누르면 토스트 메세지를 띄우며 이전 화면으로 돌아감
        Button finishBtn = (Button)findViewById(R.id.finishBtn);
        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();

                Toast toast = Toast.makeText(getApplicationContext(), "글 등록이 완료 되었습니다.", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
