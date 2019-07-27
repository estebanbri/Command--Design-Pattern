package behavioral.impl;

import behavioral.ICommand;
import behavioral.Reciever1;

public class DepositarCommand1 implements ICommand {

    Reciever1 reciever1;
    int newState;

    public DepositarCommand1(Reciever1 reciever1, int newState){
        this.reciever1 = reciever1;
        this.newState = newState;
    }

    @Override
    public void execute() {
        System.out.println("DepositarCommand1");
        reciever1.depositarAction1(this.newState);
    }

}
