package com.urahamat01.surveyapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserAdaper extends RecyclerView.Adapter<UserAdaper.ViewHolder> {

    private List<User> users;

    public UserAdaper(List<User> users) {
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
        holder.quesIdTv.setText(user.getQuestion());
        holder.typeIdTv.setText(user.getType());
        holder.optionIdTv.setText(user.getOptions());
        holder.repestIdTv.setText(Boolean.toString(user.isRequired()));

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView quesIdTv, typeIdTv, optionIdTv, repestIdTv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            quesIdTv = itemView.findViewById(R.id.textView);
            typeIdTv = itemView.findViewById(R.id.type);
            optionIdTv = itemView.findViewById(R.id.dropdown);
            repestIdTv = itemView.findViewById(R.id.required);
        }
    }
}
