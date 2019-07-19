package questao08;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        ComponenteConcreto componente = new ComponenteConcreto();


        InterceptadorCronometro cronometro = new InterceptadorCronometro(componente);
        InterceptadorVerificadorMinuto verificadorMinuto = new InterceptadorVerificadorMinuto(cronometro);
        InterceptadorLog log = new InterceptadorLog(verificadorMinuto);
        log.executarTarefa();
    }
}
