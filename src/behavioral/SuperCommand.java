package behavioral;

import java.util.ArrayList;
import java.util.List;

public class SuperCommand implements ICommand {

    List<ICommand> commands = new ArrayList<>();

    public SuperCommand(List<ICommand> commands){
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(ICommand command : commands){
            command.execute();
        }
    }
}
