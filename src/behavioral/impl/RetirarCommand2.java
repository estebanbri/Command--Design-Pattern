package behavioral.impl;

import behavioral.ICommand;
import behavioral.Reciever1;

public class RetirarCommand2 implements ICommand {

    Reciever1 reciever1;
    int newState;

    public RetirarCommand2(Reciever1 reciever1, int newState){
        this.reciever1 = reciever1;
        this.newState = newState;
    }

    @Override
    public void execute() {
        System.out.println("RetirarCommand2");
        reciever1.retirarAction2(this.newState);
    }

}
