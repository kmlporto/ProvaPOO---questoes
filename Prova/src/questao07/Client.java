package questao07;

public class Client {
    public static void main(String[] args) {
        Tabela tab = new Tabela();
        Linha linha = new Linha();
        Celula nome = new Celula("Nomes");
        Celula data = new Celula("data");
        linha.adicionar(nome);
        linha.adicionar(data);
        tab.adicionar(linha);

        Linha linha2 = new Linha();
        Celula kamila = new Celula("Kamila");
        Celula data1 = new Celula("17/06/1991");
        linha2.adicionar(kamila);
        linha2.adicionar(data1);
        tab.adicionar(linha2);

        Linha linha3 = new Linha();
        Celula aretuza = new Celula("Aretuza");
        Celula data3 = new Celula("07/01/1987");
        linha3.adicionar(aretuza);
        linha3.adicionar(data3);
        tab.adicionar(linha3);

        tab.imprimir();
    }
}
