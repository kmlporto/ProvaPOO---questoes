package questao05;

public abstract class ArquivoComponent {
    String nome;

    public ArquivoComponent(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public boolean add (ArquivoComponent novoArquivo) {
        return false;
    }

    public boolean remove (String nomeArquivo) {
        return false;
    }

    public ArquivoComponent getArquivo (String nomeArquivo) {
        return null;
    }

    public String imprimir() {
        return nome + "/";
    }
}
