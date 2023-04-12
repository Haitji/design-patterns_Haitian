package com.kreitek.editor.commands;

import com.kreitek.editor.Command;
import com.kreitek.editor.Memento;

import java.util.ArrayList;
import java.util.List;

public class AppendCommand implements Command {
    private final String text;


    public AppendCommand(String text) {
        this.text = text;
    }

    @Override
    public void execute(ArrayList<String> documentLines, List<Memento> listMemento) {
        documentLines.add(text);
        listMemento.add(new Memento(documentLines));
    }
}
