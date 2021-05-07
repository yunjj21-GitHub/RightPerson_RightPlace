package org.techtown.rightperson_rightplace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    private ArrayList<HomeItem> dataList;

    // 뒤로가기 두번 클릭 시 앱 종료 (바로 종료되는 것을 방지)
    private long backBtnTime = 0;

    @Override
    public void onBackPressed() {
        long curTime = System.currentTimeMillis();
        long gapTime = curTime - backBtnTime;

        if(0 <= gapTime && 2000 >= gapTime) {
            super.onBackPressed();
        }
        else {
            backBtnTime = curTime;
            Toast.makeText(this, "버튼을 한번 더 누르시면 종료됩니다.",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        // 홈화면에 리스트 띄워주는 부분
        this.InitializeData();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView_home);
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(new MyAdapter_home(dataList));

        // 글작성 버튼을 누르면 글작성 화면으로 이동함
        Button writeBtn = (Button)findViewById(R.id.goWritePageBtn);
        writeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WritePage.class);
                startActivity(intent);
            }
        });

        // 채팅 버튼을 누르면 채팅목록화면으로 이동함
        Button chatingBtn = (Button)findViewById(R.id.chatingBtn);
        chatingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Chating.class);
                startActivity(intent);
                finish();
            }
        });

        // 우측 상단에 돋보기 버튼을 누르면 검색 화면으로 이동
        Button searchBtn = (Button)findViewById(R.id.searchBtn);
        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Search.class);
                startActivity(intent);
            }
        });
    }

    public void InitializeData(){ // 리스트할 Item을 더해줌
        dataList = new ArrayList<>();

        dataList.add(new HomeItem("집 앞 눈 같이 치워주세요ㅠㅠ", 2, 15000));
        dataList.add(new HomeItem("중요한 택배 대신 받아줄 사람 구합니다.", 1, 5000));
        dataList.add(new HomeItem("일일 자전거 선생님 구해요~^^", 5, 10000));
        dataList.add(new HomeItem("강아지 산책 도우미 구합니다!", 1, 15000));
        dataList.add(new HomeItem("아이 등하교 같이 해주실 아주머니 급구", 2, 9000));
    }
}
