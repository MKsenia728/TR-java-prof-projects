package MyCollections;


public class StackPlus<T> extends CollectionPlus<T> implements OwnStack<T>{
    public StackPlus() {
    }

    public StackPlus(int size) {
        super(size);
    }

    public StackPlus(int size, int growthRate) {
        super(size, growthRate);
    }

    @Override
    public void push(T el) {
        if (needIncrease()) increase();
        list[++pointer] = el;
    }

    @Override
    public T pop() throws Exception {
        T el = peek();
        list[pointer--] = null;
        if (needDecrease()) decrease();
        return el;
    }

    @Override
    public T peek() throws Exception {
        if (pointer < 0) throw new Exception("!!! MY Exception - There are no any elements");
        return (T) list[pointer];
    }

    @Override
    public boolean isEmpty() {
        return pointer < 0;
    }

}
