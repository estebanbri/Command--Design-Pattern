package behavioral;

import behavioral.*;
import behavioral.impl.CerrarOperacionCommand3;
import behavioral.impl.DepositarCommand1;
import behavioral.impl.RetirarCommand2;

import java.util.Arrays;

/**
 *  Este cliente usa el invoker que agrega cada comando en una List
 *  es decir los va ubicando en orden a medida que vamos agregando
 *  comandos a la lista y la ejecucion de los comandos se realiza
 *  recorriendo todos los comandos en orden segun el orden de insercion
 */
public class Cliente2 {
    public static void main(String[] args) {

        /**
         *  SETEO DEL AMBIENTE
         */
        // Invoker
        InvokerList invoker = new InvokerList();

        // Reciever -> Saldo inicial $100
        Reciever1 reciever1 = new Reciever1(100);

        // Commands --- = REQUESTS  ---
        ICommand depositarCommand = new DepositarCommand1(reciever1, 20);
        ICommand retirarCommand = new RetirarCommand2(reciever1, 5);
        ICommand superCommand = new SuperCommand(Arrays.asList(
                new DepositarCommand1(reciever1, 10),
                new DepositarCommand1(reciever1, 10)));
        ICommand cerrarCommand = new CerrarOperacionCommand3(reciever1);

        // Invoker(ICommand)
        invoker.addCommand(depositarCommand);
        invoker.addCommand(retirarCommand);
        invoker.addCommand(superCommand);
        invoker.addCommand(cerrarCommand);

        /**
         *  Ejecucion de los comandos de todos los comandos en el orden que se hayan insertado (es decir el orden de addCommand)
         */
        invoker.execute();
    }
}
