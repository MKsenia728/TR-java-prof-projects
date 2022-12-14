package MyCollections;

import java.util.ArrayList;
import java.util.List;


public class QueuePlus<T> extends CollectionPlus<T> implements OwnQueue<T> {
    List<T> list = new ArrayList<>();

    @Override
    public void add(T el) {
        list.add(el);
    }

    @Override
    public boolean isEmpty() {
        return list.size() == 0;
    }

    @Override
    public T remove() throws Exception {
        T el = element();
        list.remove(0);
        return el;
    }

    @Override
    public T poll() {
        T el = peek();
        if (el != null)
            list.remove(0);
        return el;
    }

    @Override
    public T peek() {
        return (isEmpty()) ? null : list.get(0);
    }

    @Override
    public T element() throws Exception {
        if (isEmpty()) throw new Exception("MY exception - There are now any elements");
        else return list.get(0);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
