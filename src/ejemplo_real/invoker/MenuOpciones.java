package ejemplo_real.invoker;

import ejemplo_real.command.ICommand;

import java.util.HashMap;
import java.util.Map;

public class MenuOpciones {

    Map<String, ICommand> opcionesCommands = new HashMap();

    public void addCommand(String commandName, ICommand command){
        this.opcionesCommands.put(commandName,command);
    }

    public void clickEn(String commandName){
        ICommand command = this.opcionesCommands.get(commandName);
        command.execute();
    }
}
