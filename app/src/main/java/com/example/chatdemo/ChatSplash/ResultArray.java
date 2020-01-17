package com.example.chatdemo.ChatSplash;

import java.util.ArrayList;

/**
 * Created by root on 9/3/17.
 */

public class ResultArray {
    private ArrayList<ResultModel> data;

    public ArrayList<ResultModel> getResultList() {
        return data;
    }

    public void setResultList(ArrayList<ResultModel> wifiList) {
        this.data = wifiList;
    }
}
