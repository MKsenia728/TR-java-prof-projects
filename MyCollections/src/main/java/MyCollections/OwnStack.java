package MyCollections;

public interface OwnStack<T> {
    void push(T el);
    T pop() throws Exception;
    T peek() throws Exception;
    boolean isEmpty();

}
