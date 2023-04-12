package com.kreitek.editor.commands;

import com.kreitek.editor.Command;
import com.kreitek.editor.MementoCaretaker;

import java.util.ArrayList;

public class UndoCommand implements Command{


    private MementoCaretaker caretaker = MementoCaretaker.getInstance();
    @Override
    public void execute(ArrayList<String> documentLines) {
        documentLines.clear();
        documentLines.addAll(caretaker.getLastMemento().getRestudy());
        //System.out.println(caretaker.getLastMemento().getRestudy());

    }
}
