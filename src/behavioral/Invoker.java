package behavioral;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<ICommand> commands = new ArrayList();

    public void addCommand(ICommand command){
        this.commands.add(command);
    }

    public void execute(){
        for(ICommand command : commands){
            command.execute();
        }
    }
}
