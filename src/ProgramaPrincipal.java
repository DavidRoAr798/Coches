import java.util.*;

public class ProgramaPrincipal {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Coches> cochesList = new ArrayList<>();

        Coches coche1 = new Coches(1L, "9299BVS", "Nissan", "Primera", 2003);
        Coches coche2 = new Coches(2L, "2589BXJ", "Honda", "Civic", 2004);
        Coches coche3 = new Coches(3L, "4589CBC", "Seat", "Leon", 2006);
        Coches coche4 = new Coches(4L, "4569XLN", "BMW", "X3", 2016);
        Coches coche5 = new Coches(5L, "1234MLN", "Nissan", "Primera", 2008);

        cochesList.add(coche1);
        cochesList.add(coche2);
        cochesList.add(coche3);
        cochesList.add(coche4);
        cochesList.add(coche5);

        Collections.sort(cochesList);

        for (Coches coches: cochesList){
            System.out.println(coches);
        }
    }
}