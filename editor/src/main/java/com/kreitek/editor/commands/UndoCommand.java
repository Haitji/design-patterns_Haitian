package com.kreitek.editor.commands;

import com.kreitek.editor.Command;
import com.kreitek.editor.Memento;

import java.util.ArrayList;
import java.util.List;

public class UndoCommand implements Command{

    private int contador;
    public UndoCommand(int num){
        this.contador=num;
    }

    @Override
    public void execute(ArrayList<String> documentLines, List<Memento> listMemento) {
        if(listMemento.size()==1){
            System.err.println("No hay un estado anterior a este.");
        }else{
            documentLines.clear();
            documentLines.addAll(listMemento.get(listMemento.size()-contador).getRestudy());
        }
    }
}
