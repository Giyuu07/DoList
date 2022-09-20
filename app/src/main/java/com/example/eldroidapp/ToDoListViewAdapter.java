package com.example.eldroidapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ToDoListViewAdapter extends RecyclerView.Adapter<ToDoListViewHolder> {
    Context context;
    public List<ToDoItem> toDoList;

    public ToDoListViewAdapter(Context context, List<ToDoItem> toDoList){
        this.context = context;
        this.toDoList = toDoList;


    }
    @NonNull
    @Override
    public ToDoListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_view, parent, false);
        return new ToDoListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ToDoListViewHolder holder, int position) {
        holder.tvToDoItem.setText(toDoList.get(position).getItemToDo());

    }

    @Override
    public int getItemCount() {
        return toDoList.size();
    }
}

