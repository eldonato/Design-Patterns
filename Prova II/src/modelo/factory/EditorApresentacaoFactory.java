package modelo.factory;

import modelo.editor.Editor;
import modelo.editor.EditorApresentacao;

public class EditorApresentacaoFactory extends EditorFactory{

    @Override
    public Editor getEditor() {
        return new EditorApresentacao();
    }
}
