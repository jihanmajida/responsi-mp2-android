package com.example.a0632_responsimobile.util;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferencesHelper {
    private static PreferencesHelper INSTANCE;
    private SharedPreferences sharedPreferences;

    private PreferencesHelper(Context context){
        sharedPreferences = context
                .getApplicationContext()
                .getSharedPreferences("com.example.0632_responsimobile.com", Context.MODE_PRIVATE);
    }

    public static PreferencesHelper getInstance(Context context){
        if (INSTANCE == null){
            INSTANCE = new PreferencesHelper(context);
        }
        return INSTANCE;
    }

    public SharedPreferences preferences(){
        return sharedPreferences;
    }

    public void setLogin(boolean isLogin){
        sharedPreferences.edit().putBoolean("isLogin", isLogin).apply();
    }

    public Boolean isLogin(){
        return sharedPreferences.getBoolean("isLogin", false);
    }

    public void setMail(String eMail){
        sharedPreferences.edit().putString("e-mail", eMail).apply();
    }

    public String isMail(){
        return sharedPreferences.getString("e-mail", "suhajiihan@students.amikom.ac.id");
    }

    public void setPass(String pass){
        sharedPreferences.edit().putString("pass", pass).apply();
    }

    public String isPass(){
        return sharedPreferences.getString("pass", "qwertyuiop");
    }
}
