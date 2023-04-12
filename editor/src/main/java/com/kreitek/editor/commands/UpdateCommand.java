package com.kreitek.editor.commands;

import com.kreitek.editor.Command;
import com.kreitek.editor.Memento;
import com.kreitek.editor.MementoCaretaker;

import java.util.ArrayList;

public class UpdateCommand implements Command {
    private final String text;
    private final int lineNumber;
    private MementoCaretaker caretaker = MementoCaretaker.getInstance();

    public UpdateCommand(String text, int lineNumber) {
        this.text = text;
        this.lineNumber = lineNumber;
    }

    @Override
    public void execute(ArrayList<String> documentLines) {
        if (documentLines.size() > lineNumber){
            documentLines.set(lineNumber, text);
            caretaker.addMemento(new Memento(documentLines));
        }
        else{
            documentLines.add(text);
            caretaker.addMemento(new Memento(documentLines));
        }
    }
}
