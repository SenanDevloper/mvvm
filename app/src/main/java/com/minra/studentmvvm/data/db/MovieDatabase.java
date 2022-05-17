package com.minra.studentmvvm.data.db;


import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.minra.studentmvvm.App;
import com.minra.studentmvvm.data.model.Student;

/**
 * Created by Mohammed Senan on 30/03/2022.
 */
@Database(entities = {Student.class}, version = 1, exportSchema = false)
public abstract class MovieDatabase extends RoomDatabase {

    private static MovieDatabase sInstance;

    public static MovieDatabase getInstance() {
        if (sInstance == null) {
            sInstance = Room.databaseBuilder(App.getInstance(), MovieDatabase.class, "Student.db").build();
        }
        return sInstance;
    }
}
