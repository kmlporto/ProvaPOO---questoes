package questao07;

import java.util.ArrayList;
import java.util.List;

public class Tabela implements Dados {
    private List<Linha> linhas = new ArrayList<Linha>();

    public void adicionar(Linha l) {
        linhas.add(l);
    }

    @Override
    public void imprimir() {
        linhas.forEach(Dados::imprimir);
    }
}
