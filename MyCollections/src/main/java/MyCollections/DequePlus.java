package MyCollections;

import java.util.ArrayList;
import java.util.List;

public class DequePlus<T> extends CollectionPlus<T> implements OwnDeque<T> {
    List<T> list = new ArrayList<>();

    @Override
    public void add(T el) {
        list.add(el);
    }

    @Override
    public void addLast(T el) {
        list.add(el);
    }

    @Override
    public void addFirst(T el) {
        list.add(0, el);
    }

    @Override
    public boolean isEmpty() {
        return list.size() == 0;
    }

    @Override
    public T poll() {
        T el = peek();
        if (el != null)
            list.remove(0);
        return el;
    }

    @Override
    public T pollFirst() {
        T el = peekFirst();
        if (el != null)
            list.remove(0);
        return el;
    }

    @Override
    public T pollLast() {
        T el = peekLast();
        if (el != null)
            list.remove(list.size() - 1);
        return el;
    }

    @Override
    public T remove() throws Exception {
        T el = element();
        list.remove(0);
        return el;
    }

    @Override
    public T removeFirst() throws Exception {
        T el = elementFirst();
        list.remove(0);
        return el;
    }

    @Override
    public T removeLast() throws Exception {
        T el = elementLast();
        list.remove(list.size() - 1);
        return el;
    }

    @Override
    public T peek() {
        return (isEmpty()) ? null : list.get(0);
    }

    @Override
    public T peekFirst() {
        return (isEmpty()) ? null : list.get(0);
    }

    @Override
    public T peekLast() {
        return (isEmpty()) ? null : list.get(list.size() - 1);
    }

    @Override
    public T element() throws Exception {
        if (isEmpty()) throw new Exception("MY exception - NoSuchElementException");
        return list.get(0);
    }

    @Override
    public T elementFirst() throws Exception {
        if (isEmpty()) throw new Exception("My exception - NoSuchElementException");
        return list.get(0);
    }

    @Override
    public T elementLast() throws Exception {
        if (isEmpty()) throw new Exception("NoSuchElementException");
        return list.get(list.size() - 1);
    }

    @Override
    public String toString() {
        return list.toString();
    }

    @Override
    public int size() {
        return list.size();
    }
}
