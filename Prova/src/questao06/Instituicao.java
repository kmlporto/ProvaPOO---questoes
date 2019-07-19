package questao06;

import java.util.ArrayList;

public class Instituicao implements Dados{
    public ArrayList<Individuo> membros;

    public Instituicao(){
        membros = new ArrayList<>();
    }

    public void add(Individuo membro){
        membros.add(membro);
    }

    public void remove(Individuo membro){
        membros.remove(membro);
    }

    public ArrayList<Individuo> getMembros() {
        return membros;
    }

    @Override
    public int contagemPessoas() {
        return getMembros().size();
    }
}
