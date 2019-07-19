package questao07;

public class Client {
    public static void main(String[] args) {
        Tabela tab = new Tabela();
        Linha linha = new Linha();
        Celula celula = new Celula("Conteudo");
        for(int i=0; i<10; i++)
            linha.adicionar(celula);
        for(int i=0; i<10; i++)
            tab.adicionar(linha);

        tab.imprimir();
    }
}
