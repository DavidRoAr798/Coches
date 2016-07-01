import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CochesTreeset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Coches coche1 = new Coches(1L, "9299BVS", "Nissan", "Primera", 2003);
        Coches coche2 = new Coches(2L, "2589BXJ", "Honda", "Civic", 2003);
        Coches coche3 = new Coches(3L, "4589CBC", "Porsche", "Panamera", 2017);
        Coches coche4 = new Coches(4L, "4569XLN", "BMW", "X3", 2016);
        Coches coche5 = new Coches(5L, "1234MLN", "Chevrolet", "Camaro", 2008);


        Set setcoches = new TreeSet(new CarComparatorByAño());

        setcoches.add(coche1);
        setcoches.add(coche2);
        setcoches.add(coche3);

        setcoches.add(coche4);
        setcoches.add(coche5);

        System.out.println(setcoches);
    }
}
