import java.util.ArrayList;

public class Table<K, V> {

    class Entry {
        Entry(K key, V value)
        {
            this.key = key;
            this.value = value;
            this.next = null;
        }

        public Entry next;
        public K key;
        public V value;
    }

    Table()
    {
        table = new ArrayList<>();
        size = 0;
        maxSize = 20;

        for (int i = 0; i < maxSize; ++i)
        {
            table.add(null);
        }

    }
    public void add(K key, V value)
    {
        int index = getHash(key);

        Entry head = table.get(index);
        while (head != null)
        {
            if (head.key.equals(key))
                head.value = value;
            head = head.next;
        }

        ++size;
        head = table.get(index);
        Entry newHead = new Entry(key,value);
        newHead.next = head;
        table.set(index,newHead);
        tryIncreaseSize();
    }

    public V get(K key)
    {
        int index = getHash(key);
        Entry head = table.get(index);
        while (head  != null)
        {
            if (head.key.equals(key))
                return head.value;
            head = head.next;
        }
        return null;
    }

    public int getHash(K key)
    {
        return Math.abs(key.hashCode()) %  table.size();
    }

    private void tryIncreaseSize()
    {
        if ((double)size/(double)maxSize >= 0.7) {
            ArrayList<Entry> tempTable = new ArrayList<>();
            maxSize += 10;
            size = 0;
            for (int i = 0; i < maxSize; ++i) {
                table.add(null);
                for (Entry headEntry : tempTable)
                {
                    while (headEntry != null)
                    {
                        add(headEntry.key,headEntry.value);
                        headEntry = headEntry.next;
                    }
                }
            }
        }
    }
    private ArrayList<Entry> table;
    private int size;
    private int maxSize;

}

