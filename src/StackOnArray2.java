import java.util.EmptyStackException;

public class StackOnArray2<T> {

    public StackOnArray2() {
        capacity = 0;
        stack = (T[]) new Object[0];
    }

    public void push(T data)
    {
        if (stack.length <= capacity) {
            increaseSize();
        }
        stack[capacity++] = data;
    }

    public T pop()
    {
        if (isEmpty())
            throw new EmptyStackException();

        T result = stack[--capacity];
        stack[capacity] = null;
        return result;
    }
    public boolean isEmpty()
    {
        return capacity == 0;
    }

    private void increaseSize()
    {
        Object[] tempStack = new Object[capacity + 5];
        System.arraycopy(stack, 0, tempStack, 0, stack.length);
        stack = (T[])tempStack;
    }
    private T[] stack;
    private int capacity;
}
