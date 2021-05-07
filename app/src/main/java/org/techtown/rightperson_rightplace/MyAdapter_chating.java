package org.techtown.rightperson_rightplace;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter_chating extends RecyclerView.Adapter<ViewHolder_chating> {
    private ArrayList<ChatingItem> myDataList = null;

    MyAdapter_chating(ArrayList<ChatingItem> dataList){
        myDataList = dataList;
    }

    @Override
    public ViewHolder_chating onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.item_chating_cardview, parent, false);
        ViewHolder_chating viewHolder = new ViewHolder_chating(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder_chating holder, int position) {
        holder.profileImage.setImageResource(myDataList.get(position).getProfileImage());
        holder.nickname.setText(myDataList.get(position).getNickname());
        holder.preChating.setText(myDataList.get(position).getPreChating());
    }

    @Override
    public int getItemCount() {
        return myDataList.size();
    }
}
