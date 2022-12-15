package MyCollections;

import java.util.ArrayList;
import java.util.List;


public class QueuePlus<T> extends CollectionPlus<T> implements OwnQueue<T> {
    public QueuePlus() {
    }

    public QueuePlus(int size) {
        super(size);
    }

    public QueuePlus(int size, int growthRate) {
        super(size, growthRate);
    }
//    List<T> list = new ArrayList<>();


    @Override
    public void add(T el) {
        if (needIncrease()) increase();
        list[++pointer] = el;
    }

    @Override
    public boolean isEmpty() {
        return pointer < 0;
    }

    @Override
    public T remove() throws Exception {
        T el = element();
        if (el != null){
            list[0] = null;
            moveFromTo(0);
            pointer--;
        }
        if (needDecrease()) decrease();
        return el;
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
    public T peek() {
        return (isEmpty()) ? null : (T) list[0];
    }

    @Override
    public T element() throws Exception {
        if (isEmpty()) throw new Exception("MY exception - There are now any elements");
        else return (T) list[0];
    }

    @Override
    public void moveFromTo(int to) {
        for (int i = to; i < pointer; i++) {
            list[i] = list[i+1];
        }
    }


}
