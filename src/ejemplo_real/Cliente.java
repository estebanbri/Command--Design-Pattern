package ejemplo_real;

import ejemplo_real.command.impl.AbrirCommand;
import ejemplo_real.command.impl.CerrarCommand;
import ejemplo_real.invoker.AtajoTeclado;
import ejemplo_real.invoker.MenuOpciones;
import ejemplo_real.reciever.Documento;

public class Cliente {
        // RESUMEN: DESDEBLAMOS DE QUIEN INVOCA(INVOKER1: MENU, INVOKER2: ATAJO), DE QUIEN EJECUTA LA ACCION CONCRETA(DOCUMENTO).
        // INVOKER <-> COMMAND/REQUEST <-> TARGET/RECIEVER (el TARGET que tiene el codigo de las acciones concretas)

        public static void main(String[] args) {
            // Creo el INVOKER
            MenuOpciones menu = new MenuOpciones();
            // Creo el  TARGET o RECIEVER
            Documento documento = new Documento();

            // Bindeo los COMMANDS al INVOKER
            menu.addCommand("abrir", new AbrirCommand(documento));
            menu.addCommand("cerrar", new CerrarCommand(documento));


            // USAGE
            menu.clickEn("abrir");
            menu.clickEn("cerrar");

            /**
             *  NUEVO COMMAND
             */
            // EL DIA DE MAÑANA TE DICEN EL MENU TAMBIEN TIENE QUE TENER LA FUNCIONALIDAD 'GUARDAR DOCUMENTO'
            // Pasos:
            // 0. Creo el metodo guardar() en la clase Documento (target)
            // 1. Creo el command GuardarCommand.java implements ICommand, y apunto a dicho metodo guardar() recientemente definido en Documento
            // 2. BIND INVOKER-COMMAND(En CLIENTE):  menu.addCommand("guardar", new GuardarCommand(documento));
            // 3. USO (En CLIENTE):  menu.clickEn("guardar"); (En el Cliente)

            /**
             *  NUEVO INVOKER
             */
            // EL DIA DE MAÑANA TE DICEN DICHA FUNCIONALIDAD 'CERRAR DOCUMENTO' TAMBIEN DEBE SER POSIBLE USANDO UN ATAJO DE TECLADO
            // Pasos:
            // Crea una clase AtajoTeclado (nuestro nuevo INVOKER del comando ya creado GuardarCommand)
            // Dentro de la nueva clase AtajoTeclado agregarle una property que sea de tipo ICommand
            // Dentro de la nueva clase AtajoTeclado agrgarle un metodo para agregar commands y otro para llamar a su metodos execute's.

            // Creo el INVOKER
            AtajoTeclado atajoTeclado = new AtajoTeclado();

            // Bindeo el COMMANDS al INVOKER
            atajoTeclado.addCommand("cerrar", new CerrarCommand(documento));

            // USAGE
            atajoTeclado.pulsoAtajo("cerrar");
        }

}
