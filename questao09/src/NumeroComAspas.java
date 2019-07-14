public class NumeroComAspas extends NumeroDecorator {

    public NumeroComAspas(Numero numero) {
        super(numero);
    }

    @Override
    public String imprime() {
        return ("\"" + this.numero.imprime() + "\"");
    }
}
