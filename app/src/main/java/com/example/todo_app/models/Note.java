package com.example.todo_app.models;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.Exclude;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Note implements IdModel {
    public String title;
    public String description;
    public String date;
    //default constructor
    @Exclude
    private String _id;

    public Note() {
    }

    public Note(String title, String description, String date) {
        this.title = title;
        this.description = description;
        this.date = date;

    }

    @Override
    public String getId() {
        return _id;
    }

    @Override
    public void setId(String id) {
        _id = id;
    }
}
