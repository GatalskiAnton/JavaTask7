import java.util.EmptyStackException;

public class StackOnArray2<T> {

    public StackOnArray2() {
        stack = (T[]) new Object[size];
    }

    public void push(T data)
    {
        T[] tempStack = (T[]) new Object[++size];
        System.arraycopy(stack,0,tempStack,0,stack.length);
        tempStack[size - 1] = data;
        stack = tempStack;
    }

    public T pop()
    {
        if (isEmpty())
            throw new EmptyStackException();

        T result = stack[--size];
        T[] tempStack = (T[]) new Object[size];
        System.arraycopy(stack,0,tempStack,0,stack.length - 1);
        stack = tempStack;
        return result;
    }
    public boolean isEmpty()
    {
        return size == 0;
    }
    private T[] stack;
    private int size;
}
