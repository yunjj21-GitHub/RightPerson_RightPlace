package org.techtown.rightperson_rightplace;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder_home extends RecyclerView.ViewHolder {
    TextView title;
    TextView requestedTime;
    TextView price;

    ViewHolder_home(View itemView){
        super(itemView);

        title = itemView.findViewById(R.id.title);
        requestedTime = itemView.findViewById(R.id.requestedTime);
        price = itemView.findViewById(R.id.price);
    }
}
