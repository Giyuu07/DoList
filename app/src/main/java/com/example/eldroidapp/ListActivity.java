package com.example.eldroidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<ToDoItem> ToDos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ToDos = new ArrayList<>();
        TextView tvName = findViewById(R.id.tvName);
        String userName = getIntent().getStringExtra("KEY_USERNAME");

        EditText et_todolistinput = findViewById(R.id.et_todolistinput);
        Button btn_addList = findViewById(R.id.btn_addList);

        tvName.setText(getString(R.string.greetings, userName));

        recyclerView = findViewById(R.id.rvToDoList);
        ToDoListViewAdapter adapter = new ToDoListViewAdapter(getApplicationContext(), ToDos);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        btn_addList.setOnClickListener(view -> {
            String todo = et_todolistinput.getText().toString();

            if(todo.isEmpty()){
                Toast.makeText(
                        this,
                        "Please input a todo",
                        Toast.LENGTH_SHORT
                ).show();
            }else{
                ToDos.add(new ToDoItem(todo, false));
                Toast.makeText(
                        this,
                        "Added a list",
                        Toast.LENGTH_SHORT
                ).show();
                recyclerView.setAdapter(adapter);
                et_todolistinput.setText("");
            }
        });

    }
}