package questao05;

public class Client {
    public static void main(String[] args) {
        Arquivo comprovante = new Arquivo("comprovante.pdf", 10f);
        Arquivo foto = new Arquivo("minhafoto.jpeg", 210f);
        Pasta documentos = new Pasta("Documentos");
        Pasta comprovantes = new Pasta("Comprovantes");
        Pasta fotos = new Pasta("Minhas fotos");
        Arquivo novaFoto = new Arquivo("FotoNova.jpeg", 322f);

        comprovantes.add(comprovante);
        fotos.add(novaFoto);
        documentos.add(comprovantes);
        documentos.add(foto);
        documentos.add(fotos);

        System.out.println(documentos.imprimir());
    }
}
