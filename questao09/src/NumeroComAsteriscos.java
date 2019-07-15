public class NumeroComAsteriscos extends NumeroDecorator {

    public NumeroComAsteriscos(Numero numero) {
        super(numero);
    }

    @Override
    public String imprime() {
        return ("*" + this.numero.imprime() + "*");
    }
}
