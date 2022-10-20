public class StackTest {
    public static void main(String[] args) {
    Table<Integer, String > t1 = new Table<>();
t1.put(1,"a");
        t1.put(2,"b");
        t1.put(3,"c");
        t1.put(4,"d");
        System.out.println(t1.getHash("c"));
    }
}
