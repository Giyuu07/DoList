package com.example.eldroidapp;

public class ToDoItem {
    private int itemID;
    private String itemToDo;
    private boolean itemStatus;

    public ToDoItem(int itemID, String itemToDo, boolean itemStatus) {
        this.itemID = itemID;
        this.itemToDo = itemToDo;
        this.itemStatus = itemStatus;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
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
