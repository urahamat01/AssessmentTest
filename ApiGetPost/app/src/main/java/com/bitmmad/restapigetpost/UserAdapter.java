package com.bitmmad.restapigetpost;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    private List<User> users;

    public UserAdapter(List<User> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_user_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        User user = users.get(position);
        holder.userIdTv.setText(String.valueOf(user.getUserId()));
        holder.idTv.setText(String.valueOf(user.getId()));
        holder.titleTv.setText(user.getTitle());
        holder.bodyTv.setText(user.getBody());

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView userIdTv, idTv, titleTv, bodyTv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            userIdTv = itemView.findViewById(R.id.userIdTv);
            idTv = itemView.findViewById(R.id.idTv);
            titleTv = itemView.findViewById(R.id.titleTv);
            bodyTv = itemView.findViewById(R.id.bodyTv);
        }
    }
}
