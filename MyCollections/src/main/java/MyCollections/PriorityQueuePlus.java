package MyCollections;

public class PriorityQueuePlus<T> extends CollectionPlus<T> implements OwnPriorityQueue<T> {

    public PriorityQueuePlus() {
    }

    public PriorityQueuePlus(int size) {
        super(size);
    }

    public PriorityQueuePlus(int size, int growthRate) {
        super(size, growthRate);
    }

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
        T el = peek();
        if (el != null) {
            int i = 0;
            while (!el.equals(list[i])) i++;
            moveFromTo(i);
            pointer--;
        }
        if (needDecrease()) decrease();
        return el;
    }

    @Override
    public T peek() throws Exception {
        if (!(list[pointer] instanceof Comparable)) throw new Exception("My exception - There is not comparable");
        return (isEmpty()) ? null : (T) list[findMin()];
    }

    public void moveFromTo(int to) {
        for (int i = to; i < pointer; i++) {
            list[i] = list[i + 1];
        }
    }

    @Override
    public int findMin() {
        int indexMin = 0;
        for (int i = 1; i < pointer; i++) {
            if ((((Comparable) list[indexMin]).compareTo((Comparable) list[i])) > 0) indexMin = i;
        }
        return indexMin;
    }
}
