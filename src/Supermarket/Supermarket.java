package Supermarket;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Supermarket {
    private final Queue<String> queue1 = new ArrayDeque<>(5);
    private final Queue<String> queue2 = new ArrayDeque<>(5);
    private final Queue<String> queue3 = new ArrayDeque<>(5);

    public void addPerson(String person) {
        try {
            if (queue1.size() == 5 && queue2.size() == 5 && queue3.size() == 5){
                throw new RuntimeException();
            }
        }catch (RuntimeException e){
            System.out.println("Вызывайте Галю!");
            return;
        }
        if (queue1.size() < 5) {
            queue1.add(person);
        } else if (queue2.size() < 5) {
            queue2.add(person);
        } else if (queue3.size() < 5) {
            queue3.add(person);
        }
    }

    public void deletePerson(){
        int a = (int) (3* Math.random()+1);
        System.out.println("Удаляем человека из очереди: " +a);
        if(a == 1){
            queue1.poll();
        }if(a == 2){
            queue2.poll();
        }if(a == 3){
            queue3.poll();
        }
    }

    public void size() {
        System.out.println(queue1.size());
        System.out.println(queue2.size());
        System.out.println(queue3.size());
    }


}
