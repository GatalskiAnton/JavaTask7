public class StackTest {
    public static void main(String[] args) {
    Table<Integer, String > t1 = new Table<>();
        t1.add(1,"a");
        t1.add(2,"b");
        t1.add(3,"c");
        t1.add(4,"d");
        t1.add(5,"e");
        t1.add(6,"f");
        t1.add(7,"g");
        t1.add(85,"hAD");
        System.out.println(t1.get(1));
        System.out.println(t1.get(2));
        System.out.println(t1.get(3));
        System.out.println(t1.get(4));
        System.out.println(t1.get(5));
        System.out.println(t1.get(6));
        System.out.println(t1.get(7));
        System.out.println(t1.get(8));

    }
}
