package questao05;

public class Arquivo implements Dados {

    private String nome;
    private Float tamanho;

    public Arquivo(String nome, Float tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getTamanho() {
        return tamanho;
    }

    public void setTamanho(Float tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String imprimir() {
        return getNome() + " - " + getTamanho() + "KB";
    }

}
