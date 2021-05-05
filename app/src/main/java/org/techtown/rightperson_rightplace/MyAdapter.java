package org.techtown.rightperson_rightplace;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<Item> myDataList = null;

    MyAdapter(ArrayList<Item> dataList){
        myDataList = dataList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.item_cardview, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.title.setText(myDataList.get(position).getItemTitle());
        viewHolder.requestedTime.setText(""+myDataList.get(position).getItemRequestedTime());
        viewHolder.price.setText(""+myDataList.get(position).getItemPrice());
    }

    @Override
    public int getItemCount() {
        return myDataList.size();
    }
}
