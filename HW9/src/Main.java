import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        LList<String> newList = new LList<>();
        System.out.println("Adding element to List. Is element added to the List - " + newList.add("Venus"));
        System.out.println("List contains:" + newList.toString()+ ", " + newList.size() + " element in the list.");
        String [] arrAdd = {"Uranus", "Mars", "Saturn"};
        System.out.println("Adding elements from array of Strings to the List. Is elements added to the List - "
                 + newList.addAll(arrAdd));
        System.out.println("List contains:" + newList.toString()+ ". " + newList.size() + " elements in the list.");
        System.out.println("What is first element? First element is: "+ newList.get(0));
        System.out.println("Is list contains Uranus element? " + newList.contains("Uranus"));
        System.out.println("Deleting first element from the List. Is element deleted from the list -" + newList.delete(1));
        System.out.println("List contains:" + newList.toString()+ ". " + newList.size() + " elements in the list.");
        System.out.println("Deleting Uranus element in the List. Is Uranus deleted from the list - " + newList.delete("Uranus"));
        System.out.println("List contains:" + newList.toString()+ ". " + newList.size() + " elements in the list.");
        System.out.println("Clearing List content. Is list empty?" + newList.clear());
        System.out.println("List contains:" + newList.toString()+ ". " + newList.size() + " elements in the list.");
        LList<String> stringCollection = null;
        System.out.println("newList and stringCollection is the same? "+ newList.compare(stringCollection));

    }

}
