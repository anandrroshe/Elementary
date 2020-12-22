

import sun.plugin.javascript.navig4.Link;

import java.util.Collection;

public class LList<E> implements CustomCollection<E> {
    private int size;
    LinkList<E> first;
    LinkList<E> last;

    public class LinkList<E>{
        public  E data;
        public LinkList<E> next;
        public LinkList<E> prev;

        public LinkList(E data, LinkList<E> next, LinkList<E> prev){
            this.data = data;
            this.next = next;
            this.prev =prev;
        }
        public void getLinkList(){
        }
    }

    public LList(){
        this.first = new LinkList<>(null, first,first);
        this.last = first;
    }

    @Override
    public boolean add(E obj) {
        LinkList<E> newArr = new LinkList<E>(obj, first, last);
        last.next = newArr;
        first.prev = newArr;
        last = newArr;
        size++;
        return true;
    }

    @Override
    public boolean addAll(E[] objArr) {
        for (int i = 0; i <objArr.length ; i++) {
            add(objArr[i]);
        }
        return true;
    }

    @Override
    public boolean addAll(LList strColl) {
        LList<?> temp = (LList<?>) strColl;
        LinkList<E> tempList = (LinkList<E>)temp.first.next;
        for (int i = 0; i <strColl.size() ; i++) {
            add(tempList.data);
            tempList = tempList.next;
        }
        return true;
    }

    @Override
    public boolean delete(int index) {
        if (index>=size)return false;
        LinkList<E> temp = first;
        for (int i = 0; i <index ; i++) {
            temp = temp.next;
        }
        return delLink(temp);
    }

    private boolean delLink (LinkList<E> temp){
        if (temp.next == first)last = temp.prev;
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;
        size--;
        return true;
    }

    @Override
    public boolean delete(Object obj) {
        LinkList<E>temp = first.next;
        for (int i = 0; i <size ; i++) {
            if(temp.data == obj){
                return delLink(temp);
            }
            temp = temp.next;
        }
        return false;
    }

    @Override
    public E get(int index) {
        LinkList<E>temp = first.next;
        for (int i = 0; i <index ; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    @Override
    public boolean contains(E obj) {
        LinkList<E>temp = first.next;
        E data = temp.data;
        for (int i = 0; i <size; i++) {
            if (temp.data == obj){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    @Override
    public boolean clear() {
        first.next = first;
        first.prev = first;
        last = first;
        size = 0;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean trim() {
        return true;
    }

    @Override
    public boolean compare(LList<E> coll) {
        if (this == coll)return true;
        LList<?> temp = (LList<?>)coll;
        for (int i = 0; i < size; i++) {
            if(!this.get(i).equals(temp.get(i)))return false;
        }
        return true;
    }


    public String toString (){
        String result = " ";
        LinkList temp = first.next;
        for (int i = 0; i <size ; i++) {
            if(i < size - 1){
                result += temp.data + ", ";
            }else result +=temp.data;
            temp = temp.next;
        }
        return result;

    }
}
