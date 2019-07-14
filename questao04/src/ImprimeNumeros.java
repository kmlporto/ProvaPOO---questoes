public class ImprimeNumeros extends ImplementacaoLista {
    @Override
    public void imprime_lista() {
        for(String item: lista) {
            System.out.println(lista.indexOf(item) + ": " + item + " ");
        }
    }
}
