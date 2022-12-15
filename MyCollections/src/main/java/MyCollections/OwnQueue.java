package MyCollections;

public interface OwnQueue<T> {
    void add(T el);
    boolean isEmpty();
    T remove() throws Exception;
    T poll();
    T peek();
    T element() throws Exception;

    void moveFromTo(int to);
}
