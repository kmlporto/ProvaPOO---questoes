import java.util.ArrayList;
import java.util.List;

public class Linha implements Dados{
    private List<Celula> celulas = new ArrayList<Celula>();

    public void imprimir() {
        celulas.forEach(Dados::imprimir);
        // Imprime a borda lateral.
        System.out.println(" |");
    }

    public void adicionar(Celula c) {
        celulas.add(c);
    }
}
