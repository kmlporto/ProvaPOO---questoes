package questao04;

public class ListaNaoOrdenada extends AbstracaoLista {
    public ListaNaoOrdenada(ImplementacaoLista lista) {
        super(lista);
    }

    @Override
    public void adicionar(String elemento) {
        System.out.println("Adicionando elemento numa lista não ordenada");
        lista.add(elemento);
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo uma lista não ordenada:");
        lista.imprime_lista();
    }
}
