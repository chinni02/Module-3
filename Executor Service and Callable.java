// Class: ExecutorCallableExample
import java.util.concurrent.*;
import java.util.*;

public class ExecutorCallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Callable<String>> tasks = Arrays.asList(
            () -> "Task 1 completed",
            () -> "Task 2 completed",
            () -> "Task 3 completed"
        );

        List<Future<String>> results = executor.invokeAll(tasks);
        for (Future<String> result : results) {
            System.out.println(result.get());
        }

        executor.shutdown();
    }
}
