import java.lang.reflect.Array;
import java.util.*;


public class Duplicate {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(Arrays.asList("Anakin", "Luke", "Leia", "Rey", "Anakin", "Luke"));
        System.out.println("With duplicates: " + nameList);
        Set<String>  withoutDups = new HashSet<>(nameList);
        System.out.println("Without duplicates:" + withoutDups);
    }

}
