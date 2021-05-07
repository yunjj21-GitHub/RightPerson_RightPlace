package org.techtown.rightperson_rightplace;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder_chating extends RecyclerView.ViewHolder {
    ImageView profileImage;
    TextView nickname;
    TextView preChating;

    ViewHolder_chating(View itemView){
        super(itemView);

        profileImage = itemView.findViewById(R.id.profileImage);
        nickname = itemView.findViewById(R.id.nickname);
        preChating = itemView.findViewById(R.id.preChating);
    }
}
