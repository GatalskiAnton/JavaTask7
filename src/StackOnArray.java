import java.util.EmptyStackException;

public class StackOnArray<T> {

    StackOnArray()
    {
        size = 0;
        stack = new Object[0];
    }

    public void push(T data)
    {
        Object[] tempStack = new Object[++size];
        for (int i = 0; i < stack.length; ++i)
        {
            tempStack[i] = stack[i];
        }
        tempStack[size - 1] = data;
        stack = tempStack;
    }

    public T pop()
    {
        if (isEmpty())
            throw new EmptyStackException();

        T result = (T) stack[--size];
        Object[] tempStack = new Object[size];
        for (int i = 0; i < stack.length - 1; ++i)
        {
            tempStack[i] = stack[i];
        }
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
