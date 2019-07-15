public class Client {
    public static void main(String[] args) {
        NumeroUm numeroUm = new NumeroUm();

        NumeroComAspas numeroComAspas = new NumeroComAspas(numeroUm);
        System.out.println(numeroComAspas.imprime());

        NumeroComParenteses numeroComParentesesEAspas = new NumeroComParenteses(numeroComAspas);
        System.out.println(numeroComParentesesEAspas.imprime());

        NumeroComChaves numeroComChaves = new NumeroComChaves(numeroComParentesesEAspas);
        System.out.println(numeroComChaves.imprime());

        NumeroComAsteriscos numeroComAsteriscos = new NumeroComAsteriscos(numeroUm);
        System.out.println(numeroComAsteriscos.imprime());

        NumeroComAsteriscos numAspParChaAst = new NumeroComAsteriscos(numeroComChaves);
        System.out.println(numAspParChaAst.imprime());

    }
}
