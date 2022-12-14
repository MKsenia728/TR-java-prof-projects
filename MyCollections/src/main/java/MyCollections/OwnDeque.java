package MyCollections;

public interface OwnDeque<T>{
    void add(T el);
    void addLast(T el); /* == add*/
    void addFirst(T el);
    boolean isEmpty();
    T poll(); /* == pollFirst, null*/
    T pollFirst();
    T pollLast();
    T remove() throws Exception; /* == removeFirst, exeption*/
    T removeFirst() throws Exception;
    T removeLast() throws Exception;
    T peek();
    T peekFirst();
    T peekLast();
    T element() throws Exception;
    T elementFirst() throws Exception;
    T elementLast() throws Exception;
}
