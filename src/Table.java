import java.util.ArrayList;

public class Table<K, V> {

        Table()
        {
            table = new ArrayList<>(1);
        }
    public void put(K key, V value)
    {
        int bucket = getHash(value);
        table.add(bucket, new Entry<K,V>(key,value));
    }

    public int getHash(V value)
    {
        return value.hashCode() %  (table.size() + 1);
    }

    private ArrayList<Entry<K,V>> table;

}

class Entry<K, V> {
    Entry(K key, V value)
    {
        this.key = key;
        this.value = value;
    }
    private K key;
    private V value;
}