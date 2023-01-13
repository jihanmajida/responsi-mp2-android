package com.example.a0632_responsimobile.room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface ResponsiDao {
    @Query("SELECT *FROM user")
    List<Responsi> getAll();

    @Query("SELECT *FROM user WHERE eMail LIKE :eMail and password = :password")
    Responsi responsi (String eMail, String password);

    @Insert
    void insertAll (Responsi responsi);

    @Delete
    public void deleteUsers (Responsi users);

    @Update
    public void update (Responsi responsi);

    @Delete
    public void deleteAll (Responsi user1, Responsi user2);
}
