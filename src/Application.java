import behavioral.ICommand;
import behavioral.Invoker;
import behavioral.Reciever1;
import behavioral.SuperCommand;
import behavioral.impl.DepositarCommand1;
import behavioral.impl.CerrarOperacionCommand3;
import behavioral.impl.RetirarCommand2;

import java.util.Arrays;
import java.util.List;


public class Application {

    public static void main(String[] args) {

        Invoker invoker = new Invoker();
        // Saldo inicial $100
        Reciever1 reciever1 = new Reciever1(100);

        invoker.addCommand(new DepositarCommand1(reciever1, 20));
        invoker.addCommand(new RetirarCommand2(reciever1, 5));

        List<ICommand> commandListDepositar = Arrays.asList(
                new DepositarCommand1(reciever1, 10),
                new DepositarCommand1(reciever1, 10));
        // Idem anterior en vez de pasarlo como comandos individuales lo pasamos como supercomando o macro
        invoker.addCommand(new SuperCommand(commandListDepositar));

        invoker.addCommand(new CerrarOperacionCommand3(reciever1));

        invoker.execute();
    }
}
