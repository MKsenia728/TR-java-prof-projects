package MyCollections;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class PriorityQueuePlus<T> extends CollectionPlus<T> implements OwnPriorityQueue<T> {
    List<T> list = new ArrayList<>();

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }

    @Override
    public void add(T el) {
        list.add(el);
    }

    @Override
    public boolean isEmpty() {
        return list.size() == 0;
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public T peek() {
        return (isEmpty()) ? null : list.get(0);
    }

//    private int minEl() {
//        int indexMinEl = 0;
//        Method m = isMethod(T el);
//        for (int i = 1; i < list.size(); i++) {
//            if (list.get(indexMinEl).(list.get(i)) > 0) indexMinEl = i;
//        }
//        T minEl = list.get(0);
//        return indexMinEl;
//    }

    private Method isMethod(T el) throws NoSuchMethodException {
        Method m = null;
        try {
            m = el.getClass().getSimpleName().getClass().getMethod("compareTo");
        } catch (Exception e) {
        }
        return m;
    }
}
