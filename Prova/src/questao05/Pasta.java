package questao05;

import java.util.ArrayList;
import java.util.List;

public class Pasta extends ArquivoComponent{

    private List<ArquivoComponent> arquivos = new ArrayList<>();
    private List<Pasta> pastas = new ArrayList<>();

    public Pasta(String nome) {
        super(nome);
    }
    @Override
    public boolean add(ArquivoComponent novoArquivo) {
        if (!arquivos.contains(novoArquivo)) {
            arquivos.add(novoArquivo);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(String nomeArquivo) {
        for (ArquivoComponent arquivoComponent : arquivos) {
            if (arquivoComponent.getNome().equalsIgnoreCase(nomeArquivo)) {
                arquivos.remove(arquivoComponent);
                return true;
            }
        }
        return false;
    }

    @Override
    public ArquivoComponent getArquivo(String nomeArquivo) {
        for (ArquivoComponent arquivoComponent : arquivos) {
            if (arquivoComponent.getNome().equalsIgnoreCase(nomeArquivo)) {
                return arquivoComponent;
            }
        }
        return null;
    }

    public List<ArquivoComponent> getArquivos() {
        return arquivos;
    }

    @Override
    public String imprimir() {
        String texto = "";
        if (this.arquivos.size()>0 ){
            for(ArquivoComponent a: arquivos)
                texto = texto + nome + "/"+ a.imprimir();
        }

        return texto;
    }

}
