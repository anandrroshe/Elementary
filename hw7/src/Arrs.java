import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arrs {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<String>();

        for (int i = 0; i <6 ; i++) {
            arr.add("One");

        }
        System.out.println(arr);
        System.out.println("---------------");
        arr.add(1,"Two");
        System.out.println(arr);
        System.out.println("---------------");
        System.out.println(arr.get(1));
        System.out.println("---------------");
        arr.remove(1);
        System.out.println(arr);
        System.out.println("---------------");


        String he = new String("Helium");
        String ne = new String("Neon");
        String ar = new String("Argon");
        String kr = new String("Krypton");
        String xe = new String("Xenon");
        String rn = new String("Radon");



        ArrayList<String> nobleGases = new ArrayList<>(Arrays.asList(he, ne, ar, kr, xe, rn));
        System.out.println(nobleGases);
        System.out.println("--------------------------");
        nobleGases.add(6, "Oganesson");
        System.out.println(nobleGases);
        System.out.println("---------------");
        nobleGases.remove(1);
        System.out.println(nobleGases);
        System.out.println("---------------");
        System.out.println(nobleGases.get(1));
        System.out.println("---------------");

    }

}
