package questao05;

public class Arquivo extends ArquivoComponent {

    private Float tamanho;

    public Arquivo(String nome, Float tamanho) {
        super(nome);
        this.tamanho = tamanho;
    }

    public Float getTamanho() {
        return tamanho;
    }

    @Override
    public String imprimir() {
        return getNome() + " - " + getTamanho() + "KB\n";
    }

}
