package ejemplo_real.invoker;

import ejemplo_real.command.ICommand;

import java.util.HashMap;
import java.util.Map;

public class AtajoTeclado {
    Map<String, ICommand> opcionesCommands = new HashMap();

    public void addCommand(String commandName, ICommand command){
        this.opcionesCommands.put(commandName,command);
    }

    public void pulsoAtajo(String commandName){
        ICommand command = this.opcionesCommands.get(commandName);
        command.execute();
    }
}
