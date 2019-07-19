package questao06;

public class Congresso implements Dados{

    public int assentos;
    public int totalParticipantes;

    // TODO: 18/07/19
    public int totalParticipantes(){
        return 0;
    }

    public int totalAssentos(){
        return 0;
    }

    @Override
    public int contagemPessoas() {
        return totalParticipantes();
    }
}
