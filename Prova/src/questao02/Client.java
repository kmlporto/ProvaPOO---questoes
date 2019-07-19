package questao02;

public class Client {
    public static void main(String[] args) {
        SomadorAdapter somador = new SomadorAdapter();
        Cliente cliente = new Cliente(somador);
        cliente.executar();
    }
}
