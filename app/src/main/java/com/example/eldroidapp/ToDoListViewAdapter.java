package com.example.eldroidapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

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
        final ToDoItem todo = toDoList.get(position);
        holder.tvToDoItem.setText(toDoList.get(position).getItemToDo());
        holder.cbToDoItem.setChecked(toDoList.get(position).isItemStatus());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    @Override
    public int getItemCount() {
        return toDoList.size();
    }
}

class ToDoListViewHolder extends RecyclerView.ViewHolder {
    TextView tvToDoItem;
    CheckBox cbToDoItem;

    public ToDoListViewHolder(@NonNull View itemView) {
        super(itemView);
        tvToDoItem = itemView.findViewById(R.id.tvTodoItem);
        cbToDoItem = itemView.findViewById(R.id.cbToDoItem);
    }
}

