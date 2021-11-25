package az.et.lesson03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizingDataAccessWithSynchMethodApp {
    private static int counter = 0;

    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(20);
            SynchronizingDataAccessWithSynchMethodApp app = new SynchronizingDataAccessWithSynchMethodApp();
            for (int i = 0; i < 10; i++) executorService.submit(app::incrementAndGet);
        } finally {
            if (executorService != null) executorService.shutdown();
        }
    }

    private synchronized void incrementAndGet() {
        System.out.print(++SynchronizingDataAccessWithSynchMethodApp.counter + " ");
    }
}