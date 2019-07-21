package questao06;

public class Client {
    public static void main(String[] args) {
        Congresso pythonBrasil = new Congresso();
        ParticipanteComponent IFPB = new Instituicao("IFPB");
        IFPB.add(new Individuo("Kamila","A"));
        IFPB.add(new Individuo("Fabricio","B"));
        pythonBrasil.add(IFPB);
        pythonBrasil.add(new Individuo("Valberto","D"));

        System.out.println("Total participantes: "+pythonBrasil.totalParticipantes());
        System.out.println("Total assentos: "+pythonBrasil.totalAssentos());
    }
}
