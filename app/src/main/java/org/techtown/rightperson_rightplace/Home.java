package org.techtown.rightperson_rightplace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    private ArrayList<Item> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        this.InitializeData();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(new MyAdapter(dataList));
    }

    public void InitializeData(){
        dataList = new ArrayList<>();

        dataList.add(new Item("집 앞 눈 같이 치워주실분 구합니다!", 2, 30000));
        dataList.add(new Item("택배 대신 받아줄 사람 급구~~", 1, 5000));
        dataList.add(new Item("일일 자전거 선생님 구해요,,", 5, 50000));
        dataList.add(new Item("저희 할머니 영화관 키오스크 주문 도와주실분", 1, 15000));
        dataList.add(new Item("아이 등하교 도우미 구합니다^^", 2, 20000));
    }
}
