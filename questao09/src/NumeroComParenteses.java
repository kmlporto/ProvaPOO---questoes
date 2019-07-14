public class NumeroComParenteses extends NumeroDecorator {

    public NumeroComParenteses(Numero numero) {
        super(numero);
    }

    @Override
    public String imprime() {
        return ("(" + this.numero.imprime() + ")");
    }
}
