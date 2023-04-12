package com.kreitek.editor.commands;

import com.kreitek.editor.Command;
import com.kreitek.editor.Memento;

import java.util.ArrayList;
import java.util.List;

public class DeleteCommand implements Command {
    private final int lineNumber;


    public DeleteCommand(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    @Override
    public void execute(ArrayList<String> documentLines, List<Memento> listMemento) {
        documentLines.remove(lineNumber);
        listMemento.add(new Memento(documentLines));

    }
}
