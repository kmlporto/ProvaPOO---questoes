import java.util.ArrayList;
import java.util.List;

public class ImplementacaoLista {
    public List<String> lista;

    public ImplementacaoLista(){
        lista = new ArrayList<>();
    }

    public void add(String elemento){
        this.lista.add(elemento);
    }

    public List<String>getLista(){
        return this.lista;
    }

    public void imprime_lista(){}
}
