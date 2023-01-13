package com.example.a0632_responsimobile.room;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import androidx.annotation.NonNull;

@Entity(tableName = "user")
public class Responsi {
    @PrimaryKey (autoGenerate = true)
    @NonNull
    int id;
    @ColumnInfo (name = "eMail")
    String eMail;
    @ColumnInfo (name = "password")
    String password;
    @ColumnInfo (name = "konfim")
    String konfirm;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getKonfirm() {
        return konfirm;
    }

    public void setKonfirm(String konfirm) {
        this.konfirm = konfirm;
    }
}
