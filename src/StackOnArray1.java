import java.util.EmptyStackException;

public class StackOnArray1<T> {

    StackOnArray1() {
        capacity = 0;
        stack = new Object[0];
    }

    public void push(T data) {

        if(stack.length <= capacity) {
            increaseSize();
        }
        stack[capacity++] = data;
    }

    public T pop() {
        if (isEmpty())
            throw new EmptyStackException();

        T result = (T) stack[--capacity];
        stack[capacity] = null;
        return result;
    }

    public boolean isEmpty() {
        return capacity == 0;
    }

    private void increaseSize() {
        Object[] tempStack = new Object[capacity + 5];
        System.arraycopy(stack, 0, tempStack, 0, stack.length);
        stack = tempStack;
    }

    private Object[] stack;
    private int capacity;
}
