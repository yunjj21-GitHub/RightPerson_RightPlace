package org.techtown.rightperson_rightplace;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Chating extends AppCompatActivity {

    private ArrayList<ChatingItem> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chating);

        // 채팅화면에 채팅목록을 리스트 해주는 부분
        this.InitializeData();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView_chating);
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(new MyAdapter_chating(dataList));

        // 왼쪽 하단의 홈 버튼을 누르면 홈화면으로 이동
        Button goHomeBtn = (Button)findViewById(R.id.goHomeBtn);
        goHomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Home.class);
                startActivity(intent);
                finish();
            }
        });

        // 중앙 하단의 글 작성하기 버튼을 누르면 글 작성하기 화면으로 이동
        Button goWritePageBtn = (Button)findViewById(R.id.goWritePageBtn);
        goWritePageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WritePage.class);
                startActivity(intent);
            }
        });
    }

    // 뒤로가기 버튼 누르면 홈 화면으로 이동
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), Home.class);
        startActivity(intent);
        finish();
    }

    public void InitializeData(){ // 채팅목록에 Item을 더해주는 부분
        dataList = new ArrayList<>();

        dataList.add(new ChatingItem(R.drawable.image3, "수성로대장사랑", "강아지가 실외배변이라.."));
        dataList.add(new ChatingItem(R.drawable.image1, "눈사람", "네넵 1-2시간내에 끝날것 같네요"));
        dataList.add(new ChatingItem(R.drawable.image2, "뛰뛰빵빵", "장안공안에서 뵐까요?"));
    }
}