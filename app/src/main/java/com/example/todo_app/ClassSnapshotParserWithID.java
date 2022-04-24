package com.example.todo_app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.todo_app.models.IdModel;
import com.example.todo_app.models.Note;
import com.firebase.ui.database.ClassSnapshotParser;
import com.google.firebase.database.DataSnapshot;

public class ClassSnapshotParserWithID<T extends IdModel> extends ClassSnapshotParser<T> {
    public ClassSnapshotParserWithID(@NonNull Class<T> clazz) {
        super(clazz);
    }

    @Nullable
    @Override
    public T parseSnapshot(@NonNull DataSnapshot snapshot) {
        T model = super.parseSnapshot(snapshot);
        model.setId(snapshot.getKey());
        return model;
    }
}
