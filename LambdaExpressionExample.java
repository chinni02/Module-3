import java.util.ArrayList;
import java.util.Collections;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Sara");
        names.add("Alex");
        names.add("John");
        names.add("Zoe");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("Sorted Names:");
        names.forEach(System.out::println);
    }
}
