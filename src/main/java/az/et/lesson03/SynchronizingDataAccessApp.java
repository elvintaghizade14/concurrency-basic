package az.et.lesson03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizingDataAccessApp {
    private static int counter = 0;

    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(20);
            for (int i = 0; i < 10; i++) {
                executorService.submit(SynchronizingDataAccessApp::incrementAndGet);
            }
        } finally {
            if (executorService != null) executorService.shutdown();
        }
    }

    private static int incrementAndGet() {
        System.out.print(++SynchronizingDataAccessApp.counter + " ");
        return SynchronizingDataAccessApp.counter;
    }
}