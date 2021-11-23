package az.et.lesson01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorApp {
    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newSingleThreadExecutor();
            System.out.println("===BEGIN===");
            executorService.execute(() -> System.out.println("Hi, guys :)"));
            executorService.execute(() -> {
                for (int num = 0; num < 5; num++) {
                    System.out.println("Number is: " + num);
                }
            });
            System.out.println("====END====");
        } finally {
            if (executorService != null) executorService.shutdown();
        }
    }
}