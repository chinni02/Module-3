enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}

public class EnumExample {
    public static void main(String[] args) {
        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }
}
