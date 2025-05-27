public class TypeCastingExample {
    public static void main(String[] args) {
        double d = 9.78;
        int i = (int) d;
        System.out.println("Double: " + d);
        System.out.println("Converted to int: " + i);

        int j = 10;
        double dj = j;
        System.out.println("Int: " + j);
        System.out.println("Converted to double: " + dj);
    }
}
