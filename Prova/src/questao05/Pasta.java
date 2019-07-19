package questao05;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements Dados{

    private String nome;
    private List<Arquivo> arquivos = new ArrayList<>();
    private List<Pasta> pastas = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void add(Arquivo a){ arquivos.add(a); }
    public void remove(Arquivo a){ arquivos.remove(a); }
    public void add(Pasta p){ pastas.add(p); }
    public void remove(Pasta p){ pastas.remove(p); }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public String imprimir() {
        String texto = "Pasta - " + nome + "\n" ;
        if (this.arquivos.size()>0 ){
            for(Arquivo a: arquivos)
                texto = "\n " + texto + nome + "/"+ a.imprimir() + "\n" ;
        }
        if (this.pastas.size()>0){
            for(Pasta p: pastas)
                texto = "\n " + texto + p.nome + "/" + p.imprimir();
        }

        return texto;
    }

}
