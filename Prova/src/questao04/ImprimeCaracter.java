package questao04;

public class ImprimeCaracter extends ImplementacaoLista {

    @Override
    public void imprime_lista() {
        for(String item: lista) {
            System.out.println("*" + item + " ");
        }
    }
}
