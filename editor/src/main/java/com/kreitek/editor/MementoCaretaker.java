package com.kreitek.editor;

import java.util.ArrayList;
import java.util.List;

public class MementoCaretaker {
    private List<Memento> listMemento = new ArrayList<Memento>();
    private int contador=1;
    private static MementoCaretaker instance = null;

    private MementoCaretaker(){
        if (instance != null) {
            throw new RuntimeException("Usage getInstance() method to create");
        }
    }
    public static MementoCaretaker getInstance(){
        if (instance == null){
            instance = new MementoCaretaker();
        }
        return instance;
    }

    public void addMemento(Memento memento){
        listMemento.add(memento);

        for(int i=0;i<listMemento.size();i++){
            System.out.println(listMemento.get(i).getRestudy());
        }

    }
    public Memento getLastMemento(){
        contador++;
        return(listMemento.get(listMemento.size()-contador));
    }
}
