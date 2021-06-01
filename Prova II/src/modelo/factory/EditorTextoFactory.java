package modelo.factory;

import modelo.editor.Editor;
import modelo.editor.EditorTexto;

public class EditorTextoFactory extends EditorFactory{

    @Override
    public Editor getEditor() {
        return new EditorTexto();
    }
}
