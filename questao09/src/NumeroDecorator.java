public abstract class NumeroDecorator implements Numero {
    public Numero numero;

    public NumeroDecorator(Numero numero){
        this.numero = numero;
    }

}
