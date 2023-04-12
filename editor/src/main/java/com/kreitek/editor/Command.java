package com.kreitek.editor;

import java.util.ArrayList;
import java.util.List;

public interface Command {
    void execute(ArrayList<String> documentLines, List<Memento> listMemento);
}
