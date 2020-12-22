import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIterator<T> {

    private ArrayList<T> data;

    public ArrayIterator(){
        data = new ArrayList<T>();
    }
    public void add(T e){
        data.add(e);
    }
    public String toString (){
        return data.toString();
    }


    public class ArrIterator<T> implements Iterator {
        private int index;

        public ArrIterator() {
            index = 0;
        }

        public boolean hasNext() {
            return index < data.size();
        }

        public T next(){
            return (T) data.get(index++);
        }

        public void remove() {
            if (index > 0) {
                data.remove(index - 1);
            }
        }

    }
    public Iterator<T> iterator (){
        return new ArrIterator<T>();
    }

    public static void main(String[] args) {
        ArrayIterator<Integer> array = new ArrayIterator<Integer>();
        for (int i = 0; i <11 ; i++) {
            array.add(i);
        }
        System.out.println(array.toString());
        for (Iterator<Integer> temp = array.iterator();temp.hasNext();){
            System.out.println(temp.next());
        }
        Iterator<Integer> temp = array.iterator();
        temp.next();
        temp.remove();
        System.out.println(array.toString());


    }



}
