package questao04;

public abstract class AbstracaoLista {
    public ImplementacaoLista lista;

    public AbstracaoLista(ImplementacaoLista lista){
        this.lista = lista;
    }

    public abstract void adicionar(String elemento);
    public abstract void imprimir();

}
