package ejemplo_real.command.impl;

import ejemplo_real.command.ICommand;
import ejemplo_real.reciever.Documento;

public class CerrarCommand implements ICommand {

    Documento documento;

    public CerrarCommand(Documento documento){
        this.documento = documento;
    }

    @Override
    public void execute() {
        documento.cerrar();
    }
}
