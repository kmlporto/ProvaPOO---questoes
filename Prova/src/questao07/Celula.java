package questao07;

public class Celula implements TabelaComponent {
    private String conteudo;

    public Celula(String conteudo) {
        this.conteudo = conteudo;
    }

    public void imprimir() {
        // Limita o conteúdo a exatamente 15 caracteres.
        conteudo = conteudo + " ";

        if (conteudo.length()>15)
            conteudo = conteudo.substring(0, 15);
        else{
            while (conteudo.length() <= 15) {
                conteudo = conteudo + " ";
            }
        }
        System.out.print(" | " +  conteudo);
    }
}
