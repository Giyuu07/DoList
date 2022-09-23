package com.example.eldroidapp;
;

public class ToDoItem {
    private String itemToDo;
    private boolean itemStatus;

    public ToDoItem(String itemToDo, boolean itemStatus) {
        this.itemToDo = itemToDo;
        this.itemStatus = itemStatus;

    }

    public String getItemToDo() {
        return itemToDo;
    }

    public void setItemToDo(String itemToDo) {
        this.itemToDo = itemToDo;
    }

    public boolean isItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(boolean itemStatus) {
        this.itemStatus = itemStatus;
    }
}
