package com.kreitek.editor.commands;

import com.kreitek.editor.Command;
import com.kreitek.editor.Memento;

import java.util.ArrayList;
import java.util.List;

public class UpdateCommand implements Command {
    private final String text;
    private final int lineNumber;


    public UpdateCommand(String text, int lineNumber) {
        this.text = text;
        this.lineNumber = lineNumber;
    }

    @Override
    public void execute(ArrayList<String> documentLines, List<Memento> listMemento) {
        if (documentLines.size() > lineNumber){
            documentLines.set(lineNumber, text);
            listMemento.add(new Memento(documentLines));
        }
        else{
            documentLines.add(text);
            listMemento.add(new Memento(documentLines));
        }
    }
}
