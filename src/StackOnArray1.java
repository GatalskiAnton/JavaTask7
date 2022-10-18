import java.util.EmptyStackException;

public class StackOnArray1<T> {

    StackOnArray1()
    {
        size = 0;
        stack = new Object[0];
    }

    public void push(T data)
    {
        Object[] tempStack = new Object[++size];
        System.arraycopy(stack,0,tempStack,0,stack.length);
        tempStack[size - 1] = data;
        stack = tempStack;
    }

    public T pop()
    {
        if (isEmpty())
            throw new EmptyStackException();

        T result = (T) stack[--size];
        Object[] tempStack = new Object[size];
        System.arraycopy(stack,0,tempStack,0,stack.length - 1);
        stack = tempStack;
        return result;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    private Object[] stack;
    private int size;
}
