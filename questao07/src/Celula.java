public class Celula implements Dados{
    private String conteudo;

    public Celula(String conteudo) {
        this.conteudo = conteudo;
    }

    public void imprimir() {
        // Limita o conteúdo a exatamente 15 caracteres.
        if (conteudo.length()>15)
            conteudo = conteudo.substring(0, 15);
        // Imprime na mesma linha e com borda lateral.
        System.out.print(" | " + conteudo);
    }
}
