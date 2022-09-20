package com.example.eldroidapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        TextView tvName = findViewById(R.id.tvName);
        String userName = getIntent().getStringExtra("KEY_USERNAME");
        tvName.setText(getString(R.string.greetings, userName));

        List<ToDoItem> ToDos = new ArrayList<ToDoItem>();
        ToDos.add(new ToDoItem(1, "Water the plants", false));
        ToDos.add(new ToDoItem(2, "Buy diaper", false));
        ToDos.add(new ToDoItem(3, "Study for the exam tomorrow", false));

        RecyclerView recyclerView = findViewById(R.id.rvToDoList);
        ToDoListViewAdapter adapter = new ToDoListViewAdapter(getApplicationContext(), ToDos);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}