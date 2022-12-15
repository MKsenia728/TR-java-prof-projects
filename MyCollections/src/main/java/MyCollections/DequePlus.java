package MyCollections;

import java.util.ArrayList;
import java.util.List;

public class DequePlus<T> extends CollectionPlus<T> implements OwnDeque<T> {
    public DequePlus() {
    }

    public DequePlus(int size) {
        super(size);
    }

    public DequePlus(int size, int growthRate) {
        super(size, growthRate);
    }

    @Override
    public void add(T el) {
        if (needIncrease()) increase();
        list[++pointer] = el;
    }

    @Override
    public void addLast(T el) {
        if (needIncrease()) increase();
        list[++pointer] = el;
    }

    @Override
    public void addFirst(T el) {
        if (needIncrease()) increase();
        list[0] = el;
        pointer++;
    }

    @Override
    public boolean isEmpty() {
        return pointer < 0;
    }

    @Override
    public T poll() {
        T el = peek();
        if (el != null){
            list[0] = null;
            moveFromTo(0);
            pointer--;
        }
        if (needDecrease()) decrease();
        return el;
    }

    @Override
    public T pollFirst() {
        T el = peekFirst();
        if (el != null) {
            list[0] = null;
            moveFromTo(0);
            pointer--;
        }
        if (needDecrease()) decrease();
        return el;
    }

    @Override
    public T pollLast() {
        T el = peekLast();
        if (el != null)
            list[pointer--] = null;
        if (needDecrease()) decrease();
        return el;
    }

    @Override
    public T remove() throws Exception {
        T el = element();
        list[0] = null;
        moveFromTo(0);
        pointer--;
        if (needDecrease()) decrease();
        return el;
    }

    @Override
    public T removeFirst() throws Exception {
        T el = elementFirst();
        list[0] = null;
        moveFromTo(0);
        pointer--;
        if (needDecrease()) decrease();
        return el;
    }

    @Override
    public T removeLast() throws Exception {
        T el = elementLast();
        list[pointer--] = null;
        if (needDecrease()) decrease();
        return el;
    }

    @Override
    public T peek() {
        return (isEmpty()) ? null : (T) list[0];
    }

    @Override
    public T peekFirst() {
        return (isEmpty()) ? null : (T) list[0];
    }

    @Override
    public T peekLast() {
        return (isEmpty()) ? null : (T) list[pointer];
    }

    @Override
    public T element() throws Exception {
        if (isEmpty()) throw new Exception("MY exception - NoSuchElementException");
        return (T) list[0];
    }

    @Override
    public T elementFirst() throws Exception {
        if (isEmpty()) throw new Exception("My exception - NoSuchElementException");
        return (T) list[0];
    }

    @Override
    public T elementLast() throws Exception {
        if (isEmpty()) throw new Exception("NoSuchElementException");
        return (T) list[pointer];
    }
    @Override
    public void moveFromTo(int to) {
        for (int i = 0; i < pointer; i++) {
            list[i] = list[i+1];
        }
    }
}
