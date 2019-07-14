public class SomadorAdapter implements  SomadorEsperado{

    SomadorExistente somador;

    public SomadorAdapter(SomadorExistente somador) {
        this.somador = somador;
    }

    @Override
    public int somaVetor(int[] vetor) {
        int resultado = 0;
        for (int i : vetor)
            resultado += i;
        return resultado;
    }
}
