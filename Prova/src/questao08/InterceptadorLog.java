package questao08;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InterceptadorLog extends Interceptador {


    public InterceptadorLog(Componente componente) {
        super(componente);
    }

    @Override
    public void executarTarefa() throws InterruptedException {

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy - HH:mm");
        Date date = new Date();
        String data = dateFormat.format(date);
        System.out.println(data + ":log = executando tarefa...");
        componente.executarTarefa();
    }
}
