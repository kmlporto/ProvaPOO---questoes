package questao05;

public class Client {
    public static void main(String[] args) {
        Arquivo comprovante = new Arquivo("comprovante.pdf", 10f);
        Arquivo foto = new Arquivo("minhafoto.jpeg", 210f);
        Pasta documentos = new Pasta("Documentos");
        Pasta comprovantes = new Pasta("Comprovantes");

        comprovantes.add(comprovante);
        documentos.add(comprovantes);
        documentos.add(foto);

        System.out.println(documentos.imprimir());
    }
}
