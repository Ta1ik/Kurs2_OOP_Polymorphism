package Autoracing;

import java.util.LinkedList;
import java.util.Queue;

public class DiagnosticStation<T extends Transport> {
    private Queue <T> queue = new LinkedList<>();

    public void addTransport(T transport){
        if(transport.getClass().equals(Bus.class)){
            System.out.println("Автобус не нуждается в техобслуживании.");
        } else
            queue.offer(transport);
    }
    public void doTechnicalInspection(){
        T transport = queue.poll();
        if (transport != null){
            System.out.println(transport.getClass().getSimpleName() + " " + transport.getBrand() + " " + transport.getModel() + " проведено техническое обслуживание.");
            doTechnicalInspection();
        } else{
            System.out.println("Всем транспортным средствам проведено техническое обслуживание.");
        }
    }
}
