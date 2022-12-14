package MyCollections;

import java.util.ArrayList;
import java.util.List;

public class StackPlus<T> extends CollectionPlus<T> implements OwnStack<T>{
    List<T> list = new ArrayList<>();

    @Override
    public void push(T el) {
        list.add(el);
    }

    @Override
    public T pop() throws Exception {
        int index = list.size()-1;
        T el = peek();
        list.remove(index);
        return el;
    }

    @Override
    public T peek() throws Exception {
        int index = list.size()-1;
        if (index < 0) throw new Exception("!!! MY Exception - There are no any elements");
        return list.get(index);
    }

    @Override
    public boolean isEmpty() {
        return list.size() == 0;
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
