package questao02;

import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter implements  SomadorEsperado{

    SomadorExistente somador;

    public SomadorAdapter() {
        this.somador = new SomadorExistente();
    }

    @Override
    public int somaVetor(int[] vetor) {
        List<Integer> lista = new ArrayList<>();
        for (int i : vetor)
            lista.add(vetor[i-1]);

        return somador.somaLista(lista);
    }
}
