package questao06;

public abstract class ParticipanteComponent {
    String nome;

    public ParticipanteComponent(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void add(ParticipanteComponent participante) {}

    public int getTotalParticipante() {
        return 1;
    }
}
