public class StackTest {
    public static void main(String[] args) {
      //  Double[] result = Task5.swap(0, 1, 1.5, 2, 3);Incompatible types.
        Double[] result = Task5.<Double>swap(0, 1, 1.5, 2.0, 3.0);

    }
}
