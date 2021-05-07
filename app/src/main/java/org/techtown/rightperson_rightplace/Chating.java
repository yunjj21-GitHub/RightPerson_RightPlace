package org.techtown.rightperson_rightplace;

import android.os.Bundle;

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

        this.InitializeData();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView_chating);
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(new MyAdapter_chating(dataList));
    }

    public void InitializeData(){
        dataList = new ArrayList<>();

        dataList.add(new ChatingItem(R.drawable.avatar1, "수성로대장사랑", "강아지가 실외배변이라.."));
        dataList.add(new ChatingItem(R.drawable.avatar2, "눈사람", "네넵 1-2시간내에 끝날것 같네요"));
        dataList.add(new ChatingItem(R.drawable.avatar1, "뛰뛰빵빵", "장안공안에서 뵐까요?"));
    }
}