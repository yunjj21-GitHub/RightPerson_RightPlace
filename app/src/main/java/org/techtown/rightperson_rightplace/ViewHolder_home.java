package org.techtown.rightperson_rightplace;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder_home extends RecyclerView.ViewHolder{
    TextView title;
    TextView requestedTime;
    TextView price;

    ViewHolder_home(View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.title);
        requestedTime = itemView.findViewById(R.id.requestedTime);
        price = itemView.findViewById(R.id.price);

        // recyclerView 클릭 시 Detail화면으로 이동
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Detail.class);
                v.getContext().startActivity(intent);
            }
        });
    }
}
