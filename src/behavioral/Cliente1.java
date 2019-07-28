package behavioral;

import behavioral.ICommand;
import behavioral.InvokerMap;
import behavioral.Reciever1;
import behavioral.SuperCommand;
import behavioral.impl.CerrarOperacionCommand3;
import behavioral.impl.DepositarCommand1;
import behavioral.impl.RetirarCommand2;

import java.util.Arrays;

/**
 *  Este cliente usa el invoker que agrega cada comando en una Map
 *  es decir asocia una key a cada comando concreto asi al momento
 *  de ejecutar querer ejecutar dicho comando podemos ubicarlo por dicha key
 */
public class Cliente1 {
    public static void main(String[] args) {

        /**
         *  SETEO DEL AMBIENTE
         */
        // Invoker
        InvokerMap invoker = new InvokerMap();

        // Reciever -> Saldo inicial $100
        Reciever1 reciever1 = new Reciever1(100);

        // Commands  --- = REQUESTS  ---
        ICommand depositarCommand = new DepositarCommand1(reciever1, 20);
        ICommand retirarCommand = new RetirarCommand2(reciever1, 5);
        ICommand superCommand = new SuperCommand(Arrays.asList(
                new DepositarCommand1(reciever1, 10),
                new DepositarCommand1(reciever1, 10)));
        ICommand cerrarCommand = new CerrarOperacionCommand3(reciever1);

        // Invoker(ICommand)
        invoker.addCommand("depositar", depositarCommand);
        invoker.addCommand("retirar", retirarCommand);
        invoker.addCommand("super-command", superCommand);
        invoker.addCommand("cerrar-operacion", cerrarCommand);

        /**
         *  Ejecucion de los comandos de los comandos uno a uno especifando el orden pudiendo delay cada ejecucion si quisieras
         */
        invoker.execute("depositar");
        invoker.execute("retirar");
        invoker.execute("super-command");
        invoker.execute("cerrar-operacion");
    }
}
