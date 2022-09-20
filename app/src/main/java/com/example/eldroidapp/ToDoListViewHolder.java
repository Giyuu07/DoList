package com.example.eldroidapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ToDoListViewHolder extends RecyclerView.ViewHolder {
    TextView tvToDoItem;

    public ToDoListViewHolder(@NonNull View itemView) {
        super(itemView);
        tvToDoItem = itemView.findViewById(R.id.tvTodoItem);

    }
}
