package questao06;

public class Individuo extends ParticipanteComponent{
    public String assento;

    public Individuo(String nome, String assento){
        super(nome);
        this.assento = assento;
    }

    public String getAssunto() {
        return assento;
    }
}
