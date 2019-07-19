package questao08;

public class ComponenteConcreto implements Componente {

    //@Override
    public void executarTarefa() throws InterruptedException {

        Thread.sleep(2000);
        System.out.println("questao08.Componente Concreto");

    }
}
