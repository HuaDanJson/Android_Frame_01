package com.android.frame.db;

import com.android.frame.bean.RoomBean;

import java.util.List;

public class Dbutils {

    private static volatile Dbutils singleton;

    private Dbutils() {
    }

    public static Dbutils getInstance() {
        if (singleton == null) {
            synchronized (Dbutils.class) {
                if (singleton == null) {
                    singleton = new Dbutils();
                }
            }
        }
        return singleton;
    }

    public List<RoomBean> getRoomFromDb(){
        return null;
    }

}