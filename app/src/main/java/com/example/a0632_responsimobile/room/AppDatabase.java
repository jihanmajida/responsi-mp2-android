package com.example.a0632_responsimobile.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {Responsi.class}, version = 1)
public abstract  class AppDatabase extends RoomDatabase {
    public abstract ResponsiDao userDao();
    public static AppDatabase INSTANCE;

    public static AppDatabase getDbInstance(Context context) {
        if (INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context, AppDatabase.class, "my_database.db")
                    .allowMainThreadQueries().build();
        }
        return INSTANCE;
    }
}