import java.util.Collection;

public interface CustomCollection <E> {
    boolean add(E obj);
    boolean addAll(E[] objArr);
    boolean addAll(LList<E> strColl);
    boolean delete (int index);
    boolean delete (E obj);
    E get(int index);
    boolean contains(E obj);
    boolean clear();
    int size();
    boolean trim();
    boolean compare(LList<E> coll);


}


