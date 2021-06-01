package modelo.factory;

import modelo.editor.Editor;
import modelo.editor.EditorPlanilhas;

public class EditorPlanilhasFactory extends EditorFactory{

    @Override
    public Editor getEditor() {
        return new EditorPlanilhas();
    }
}
