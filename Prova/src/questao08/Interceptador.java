package questao08;

public abstract class Interceptador implements Componente {
    public Componente componente;

    public Interceptador(Componente componente) {
        this.componente = componente;
    }

    public void executarTarefa() throws InterruptedException {
        long antes = System.currentTimeMillis();
        componente.executarTarefa();
        long depois = System.currentTimeMillis();
        System.out.println((depois - antes) + " ms");

    }
}
