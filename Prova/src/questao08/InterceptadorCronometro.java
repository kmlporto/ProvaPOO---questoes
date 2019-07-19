package questao08;

public class InterceptadorCronometro extends Interceptador {

    public InterceptadorCronometro(Componente componente) {
        super(componente);
    }

    //@Override
    public void executarTarefa() throws InterruptedException {
        System.out.println("Cronometro");
        componente.executarTarefa();
    }
}
