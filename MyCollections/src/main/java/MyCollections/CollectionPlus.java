package MyCollections;

import java.util.Arrays;

public class CollectionPlus<T> {
    Object[] list;
    static int DEFAULT_SIZE = 10;
    static int DEFAULT_CHANGE_RATE = 2;
    static float DEFAULT_CHANGE_THRESHOLD = 0.7f;
    int size;
    int changeRate;
    int pointer;

    public CollectionPlus() {
        size = DEFAULT_SIZE;
        list = new Object[size];
        changeRate = DEFAULT_CHANGE_RATE;
        pointer = -1;
    }
    public CollectionPlus(int size) {
        this.size = size;
        list = new Object[size];
        changeRate = DEFAULT_CHANGE_RATE;
        pointer = -1;
    }

    public CollectionPlus(int size, int growthRate) {
        this.size = size;
        list = new Object[size];
        this.changeRate = growthRate;
        pointer = -1;
    }
    void increase() {
        int newSize = size * changeRate;
        list = Arrays.copyOf(list, newSize);
        size = newSize;
    }
    void decrease() {
        int newSize = size / changeRate;
        list = Arrays.copyOfRange(list, 0, newSize);
        size = newSize;
    }

    boolean needIncrease() {
        return (pointer >= (int) size * DEFAULT_CHANGE_THRESHOLD);

    }
    boolean needDecrease() {
        return (pointer < (int) (size / changeRate * DEFAULT_CHANGE_THRESHOLD) && size > DEFAULT_SIZE);
    }

    public int size() {
        return pointer + 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= pointer; i++) {
            if (i != pointer) {
                sb.append(list[i]).append(", ");
            } else {
                sb.append(list[i]);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
