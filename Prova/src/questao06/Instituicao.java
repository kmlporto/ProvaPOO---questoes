package questao06;

import java.util.ArrayList;

public class Instituicao extends ParticipanteComponent {
    public ArrayList<ParticipanteComponent> membros;

    public Instituicao(String nome) {
        super(nome);
        this.membros = new ArrayList<ParticipanteComponent>();
    }

    @Override
    public void add(ParticipanteComponent membro) {
        membros.add(membro);
    }

    public ArrayList<ParticipanteComponent> getMembros() {
        return membros;
    }

    @Override
    public int getTotalParticipante(){
        return this.membros.size();
    }
}
