package Transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation <C extends Car> {
    private final Queue<C> queue = new LinkedList<>();

    public void addCar(C car){
        queue.offer(car);
    }

    public void carryService (){
       C car = queue.poll();
       if (car != null){
           System.out.println("Проводится ремонт транспортного средства");
       } else {
           System.out.println("Очередь пуста");
       }
    }

}
