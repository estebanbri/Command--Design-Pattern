package ejemplo_real;

import ejemplo_real.command.impl.AbrirCommand;
import ejemplo_real.command.impl.CerrarCommand;
import ejemplo_real.invoker.MenuOpciones;
import ejemplo_real.reciever.Documento;

public class Cliente {

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


            // EL DIA DE MAÑANA TE DICEN EL MENU TAMBIEN TIENE QUE TENER LA FUNCIONALIDAD 'GUARDAR'
            // Pasos:
            // 1. Creo el command GuardarCommand.java implements ICommand
            // 2. BIND INVOKER-COMMAND(En CLIENTE):  menu.addCommand("guardar", new GuardarCommand(documento));
            // 3. USO (En CLIENTE):  menu.clickEn("guardar"); (En el Cliente)
        }

}
