public interface InterfaceCollection<Object>  {
    boolean add (Object o);
    boolean add(int index, Object o);
    boolean delete (Object o);
    Object get(int index);
    boolean contain(Object o);
    boolean equals (NewArr o);
    boolean clear();
    int size();
}
