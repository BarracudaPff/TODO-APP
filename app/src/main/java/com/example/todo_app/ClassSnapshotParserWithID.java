package com.example.todo_app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.todo_app.models.Note;
import com.firebase.ui.database.ClassSnapshotParser;
import com.google.firebase.database.DataSnapshot;

public class ClassSnapshotParserWithID extends ClassSnapshotParser<Note> {
    public ClassSnapshotParserWithID(@NonNull Class<Note> clazz) {
        super(clazz);
    }

    @Nullable
    @Override
    public Note parseSnapshot(@NonNull DataSnapshot snapshot) {
        Note model = super.parseSnapshot(snapshot);
        model._id = snapshot.getKey();
        return model;
    }
}
