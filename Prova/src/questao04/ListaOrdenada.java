package questao04;

import java.util.Collections;

public class ListaOrdenada extends AbstracaoLista {

    public ListaOrdenada(ImplementacaoLista lista) {
        super(lista);
    }

    @Override
    public void adicionar(String elemento) {
        System.out.println("Adicionando elemento numa lista ordenada");
        lista.add(elemento);
    }

    @Override
    public void imprimir() {
        System.out.println("Lista ordenada: ");
        Collections.sort(lista.getLista());
        lista.imprime_lista();
    }
}
