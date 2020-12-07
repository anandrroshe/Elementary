
import java.util.Arrays;


public class Arrs {

    private final int ARR_AMOUNT = 10;
    private String[] arr;
    private int add = 0;

    public Arrs(){
        arr= new String[ARR_AMOUNT];
    }

    public Arrs(String item) {
        this.arr = item.split(", ");
    }

    public void removeIndex(int index) {
        for (int i = index; i < add; i++)
            arr[i] = arr[i + 1];
        arr[index] = null;
        add--;
    }


    public void removeItem(String item) {
        add--;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(item)) {
                removeIndex(i);
                break;
            }
        }
    }

    public void adder(int index, String item) {
        if (add == arr.length) resize(1);

        for (int i = arr.length-2; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = item;
    }

    public void adder(String item) {
        resize(1);
        arr[arr.length-1] = item;
    }

    public String get(int index) {
        return arr[index];
    }

    public int size() {
        return arr.length;
    }

    private void resize(int size) {
        int newLength= arr.length + size;
        arr=Arrays.copyOf(arr, newLength);

    }
    @Override
    public String toString() {
        return Arrays.toString(arr);
    }



    public static void main(String[] args) {
       Arrs arr = new Arrs("Helium, Neon, Argon, Krypton, Xenon, Radon");
        System.out.println("Size of collection is "+ arr.size()+ ". ");
        System.out.println("Collection contains "+arr.toString()+ ". ");
        System.out.println("Size of collection is "+ arr.size()+ ". ");
        arr.adder(5, "Oganesson");
        System.out.println("Collection contains "+arr.toString()+ ". ");
        arr.adder("Radon");
        System.out.println("Size of collection is "+ arr.size()+ ". ");
        System.out.println("Collection contains "+arr.toString()+ ". ");
        System.out.println("Removing 4th element");
        arr.removeIndex(4);
        System.out.println("Collection contains "+arr.toString()+ ". ");
        arr.removeItem("Neon");
        System.out.println("Removing Neon element");
        System.out.println("Collection contains "+arr.toString()+ ". ");
        System.out.println("Fifth element is "+ arr.get(5));
    }
}
