public class Client {
    public static void main(String[] args) {
        ImplementacaoLista imprime_numeros = new ImprimeNumeros();
        AbstracaoLista lista = new ListaOrdenada(imprime_numeros);
        lista.adicionar("Maria");
        lista.adicionar("João");
        lista.adicionar("José");
        lista.imprimir();

        ImplementacaoLista imprimeLetras = new ImprimeLetras();
        lista = new ListaNaoOrdenada(imprimeLetras);
        lista.adicionar("Maria");
        lista.adicionar("João");
        lista.adicionar("José");
        lista.imprimir();

        ImplementacaoLista imprimeCaracter = new ImprimeCaracter();
        lista = new ListaOrdenada(imprimeCaracter);
        lista.adicionar("Maria");
        lista.adicionar("João");
        lista.adicionar("José");
        lista.imprimir();

    }
}
