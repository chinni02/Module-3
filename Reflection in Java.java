// Class: ReflectionExample
import java.lang.reflect.*;

public class ReflectionExample {
    public void greet() {
        System.out.println("Hello from Reflection!");
    }

    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("ReflectionExample");
        Object obj = cls.getDeclaredConstructor().newInstance();

        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method: " + m.getName());
            if (m.getName().equals("greet")) {
                m.invoke(obj);
            }
        }
    }
}
