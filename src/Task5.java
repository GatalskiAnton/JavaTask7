public class Task5 {
    public static <T> T[] swap(int i, int j, T... values)
    {
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        return values;
    }
}
