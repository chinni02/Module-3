import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();

        while (true) {
            System.out.print("Enter student ID (-1 to stop): ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            if (id == -1) break;
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            students.put(id, name);
        }

        System.out.print("Enter ID to search: ");
        int searchId = sc.nextInt();
        String result = students.getOrDefault(searchId, "ID not found");
        System.out.println("Student Name: " + result);
    }
}
