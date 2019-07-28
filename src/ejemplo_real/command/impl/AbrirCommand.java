package ejemplo_real.command.impl;

import ejemplo_real.command.ICommand;
import ejemplo_real.reciever.Documento;

public class AbrirCommand implements ICommand {

    Documento documento;

    public AbrirCommand(Documento documento){
        this.documento = documento;
    }

    @Override
    public void execute() {
        documento.abrir();
    }
}
