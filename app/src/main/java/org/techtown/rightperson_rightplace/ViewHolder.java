package org.techtown.rightperson_rightplace;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    TextView title;
    TextView requestedTime;
    TextView price;

    ViewHolder(View itemView){
        super(itemView);

        title = itemView.findViewById(R.id.title);
        requestedTime = itemView.findViewById(R.id.requestedTime);
        price = itemView.findViewById(R.id.price);
    }
}
