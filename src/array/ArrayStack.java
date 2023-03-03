package array;

public class ArrayStack<T> {
    private T[] itemsArray;
    private int top = 0;
    public int size() {
        return top;
    }

    public void push(T item) {
        itemsArray[top++] = item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new StackIsEmptyException();
        }
        return itemsArray[top - 1];
    }

    public T pop() {
        T itemOnTop = peek();
        top--;
        itemsArray[top] = null;
        return itemOnTop;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public static class StackIsEmptyException extends RuntimeException {
        private static final long serialVersionUID = 1L;
    }
}
