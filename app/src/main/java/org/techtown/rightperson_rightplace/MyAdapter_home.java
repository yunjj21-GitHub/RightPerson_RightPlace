package org.techtown.rightperson_rightplace;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter_home extends RecyclerView.Adapter<ViewHolder_home> {
    private ArrayList<HomeItem> myDataList = null;

    MyAdapter_home(ArrayList<HomeItem> dataList){
        myDataList = dataList;
    }

    @Override
    public ViewHolder_home onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.item_home_cardview, parent, false);
        ViewHolder_home viewHolder= new ViewHolder_home(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder_home viewHolder, int position) {
        viewHolder.title.setText(myDataList.get(position).getItemTitle());
        viewHolder.requestedTime.setText(""+myDataList.get(position).getItemRequestedTime());
        viewHolder.price.setText(""+myDataList.get(position).getItemPrice());
    }

    @Override
    public int getItemCount() {
        return myDataList.size();
    }
}
