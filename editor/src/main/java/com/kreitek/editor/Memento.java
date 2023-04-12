package com.kreitek.editor;

import java.util.ArrayList;

public class Memento {
    private ArrayList<String> restudy=new ArrayList<String>();

    public Memento(ArrayList<String> estado) {
        this.restudy = new ArrayList<>(estado);
    }

    public ArrayList<String> getRestudy() {
        return restudy;
    }
}
