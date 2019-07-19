package questao09;

public class NumeroComChaves extends NumeroDecorator  {

    public NumeroComChaves(Numero numero) {
        super(numero);
    }

    @Override
    public String imprime() {
        return ("{" + this.numero.imprime() + "}");
    }
}
