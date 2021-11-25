package az.et.lesson03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizingDataAccessWithSynchApp {
    private static int counter = 0;

    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(20);
            SynchronizingDataAccessWithSynchApp app = new SynchronizingDataAccessWithSynchApp();
            for (int i = 0; i < 10; i++) executorService.submit(app::incrementAndGet);
        } finally {
            if (executorService != null) executorService.shutdown();
        }
    }

    private void incrementAndGet() {
        synchronized (this) {
            System.out.print(++SynchronizingDataAccessWithSynchApp.counter + " ");
        }
    }
}