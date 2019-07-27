package behavioral.impl;

import behavioral.ICommand;
import behavioral.Reciever1;

public class CerrarOperacionCommand3 implements ICommand {

    Reciever1 reciever1;

    public CerrarOperacionCommand3(Reciever1 reciever1){
        this.reciever1 = reciever1;
    }

    @Override
    public void execute() {
        System.out.println("CerrarOperacionCommand3");
        this.reciever1.cerrarOperacionAction1();
    }
}
