package questao06;

import java.util.ArrayList;
import java.util.List;

public class Congresso {
    List<ParticipanteComponent> participantes = new ArrayList<ParticipanteComponent>();

    public void add(ParticipanteComponent participante){
        participantes.add(participante);
    }

    public int totalParticipantes(){
        return this.participantes.size();
    }

    public int totalAssentos(){
        int totalAssentos = 0;
        for (ParticipanteComponent participante: participantes)
            totalAssentos = totalAssentos + participante.getTotalParticipante();
        return totalAssentos;
    }

}
