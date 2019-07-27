package behavioral;

import java.util.HashMap;
import java.util.Map;

public class InvokerMap {

    private Map<String, ICommand> commands = new HashMap();

    public void addCommand(String commandName, ICommand command){
        this.commands.put(commandName, command);
    }

    public void execute(String commandName){
        this.commands.get(commandName).execute();
    }

}
