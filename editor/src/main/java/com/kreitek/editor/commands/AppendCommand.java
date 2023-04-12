package com.kreitek.editor.commands;

import com.kreitek.editor.Command;
import com.kreitek.editor.Memento;
import com.kreitek.editor.MementoCaretaker;

import java.util.ArrayList;

public class AppendCommand implements Command {
    private final String text;
    private MementoCaretaker caretaker = MementoCaretaker.getInstance();

    public AppendCommand(String text) {
        this.text = text;
    }

    @Override
    public void execute(ArrayList<String> documentLines) {
        documentLines.add(text);
        caretaker.addMemento(new Memento(documentLines));
    }
}
