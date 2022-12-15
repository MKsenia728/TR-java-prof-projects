package MyCollections;

public interface OwnPriorityQueue<T> {
    void add(T el);
    boolean isEmpty();
    T remove() throws Exception;
    T peek() throws Exception;
    void moveFromTo(int to);
    int findMin();
}
