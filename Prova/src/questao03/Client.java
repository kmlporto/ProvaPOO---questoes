package questao03;

public class Client {
    public static void main(String[] args) {
        //Refrigerantes servidos:

        CocaCola coca = new CocaCola();
        Guarana guarana = new Guarana();
        Fanta fanta = new Fanta();

        TamanhoMedio cocaM = new TamanhoMedio(coca);
        cocaM.beber();

        TamanhoPequeno guaranaP = new TamanhoPequeno(guarana);
        guaranaP.beber();

        TamanhoGrande fantaG = new TamanhoGrande(fanta);
        fantaG.beber();
    }
}
