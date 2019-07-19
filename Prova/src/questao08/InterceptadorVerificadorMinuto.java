package questao08;

import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import static javax.xml.bind.DatatypeConverter.parseInteger;

public class InterceptadorVerificadorMinuto extends Interceptador {

    public InterceptadorVerificadorMinuto(Interceptador interceptador) {
        super(interceptador);
    }

    //@Override
    public void executarTarefa() throws InterruptedException {
        DateFormat minutoAtual = new SimpleDateFormat("mm");
        DateFormat horaAtual = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        BigInteger minute = parseInteger(minutoAtual.format(date));
        if (minute.intValue() % 2 == 0){
            System.out.println("Execução interrompida em minuto par: "+ horaAtual.format(date));
        }else {
            System.out.println("Verificador de miniuto: " + minute);
        }
        componente.executarTarefa();
    }
}
