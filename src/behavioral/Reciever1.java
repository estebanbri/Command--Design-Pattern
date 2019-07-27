package behavioral;

public class Reciever1 {

    private int state;

    public Reciever1(int state){
        this.state = state;
    }

    public void depositarAction1(int newState){
        this.state = this.state + newState;
        System.out.println("-- [COMANDO DEPOSITAR] | " + this.state);
    }
    public void retirarAction2(int newState){
        this.state = this.state - newState;
        System.out.println("-- [COMANDO RETIRAR] | " + this.state);
    }

    public void cerrarOperacionAction1() {
        System.out.println("----- [OPERACION CERRADA] -------");
    }
}
