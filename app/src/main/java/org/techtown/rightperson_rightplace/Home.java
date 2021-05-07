package org.techtown.rightperson_rightplace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    private ArrayList<HomeItem> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        this.InitializeData();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView_home);
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(new MyAdapter_home(dataList));
    }

    public void InitializeData(){
        dataList = new ArrayList<>();

        dataList.add(new HomeItem("집 앞 눈 같이 치워주세요ㅠㅠ", 2, 15000));
        dataList.add(new HomeItem("중요한 택배 대신 받아줄 사람 구합니다.", 1, 5000));
        dataList.add(new HomeItem("일일 자전거 선생님 구해요~^^", 5, 10000));
        dataList.add(new HomeItem("강아지 산책 도우미 구합니다!", 1, 15000));
        dataList.add(new HomeItem("아이 등하교 같이 해주실 아주머니 급구", 2, 9000));
    }
}
