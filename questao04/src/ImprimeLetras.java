public class ImprimeLetras extends ImplementacaoLista {
    @Override
    public void imprime_lista() {
        for(String item: lista) {
            System.out.println("i:" + item + " ");
        }
    }
}
