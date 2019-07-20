package questao07;

import java.util.ArrayList;
import java.util.List;

public class Tabela implements TabelaComponent {
    private List<TabelaComponent> linhas = new ArrayList<TabelaComponent>();

    public void adicionar(TabelaComponent l) {
        linhas.add(l);
    }

    @Override
    public void imprimir() {
        linhas.forEach(TabelaComponent::imprimir);
    }
}
