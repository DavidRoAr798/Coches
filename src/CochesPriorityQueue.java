import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class CochesPriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Coches> cochesPriorityQueue = new PriorityQueue<>(new CarComparatorByAño());

        Coches coche1 = new Coches(1L, "9299BVS", "Nissan", "Primera", 2003);
        Coches coche2 = new Coches(2L, "2589BXJ", "Honda", "Civic", 2003);
        Coches coche3 = new Coches(3L, "4589CBC", "Porsche", "Panamera", 2017);
        Coches coche4 = new Coches(4L, "4569XLN", "BMW", "X3", 2016);
        Coches coche5 = new Coches(5L, "1234MLN", "Chevrolet", "Camaro", 2008);


    /*Set setcoches = new TreeSet(new CarComparatorByAño());*///

        cochesPriorityQueue.add(coche2);
        cochesPriorityQueue.add(coche5);
        cochesPriorityQueue.add(coche3);
        cochesPriorityQueue.add(coche4);
        cochesPriorityQueue.add(coche1);

        while (true){
            Coches coches = cochesPriorityQueue.poll();
            if (coches == null)
            {
                break;
            } else{
                System.out.println(coches);
            }
        }

        System.out.println();

    }

    }



