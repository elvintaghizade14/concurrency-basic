package az.et.lesson05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LionManager {
    public static void main(String[] args) {
        // Bad practice because we cannot clean cage
        // while lion roaming in it.
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(4);
            LionManager manager = new LionManager();
            for (int i = 0; i < 4; i++) service.submit(manager::performTask);
        } finally {
            if (service != null) service.shutdown();
        }
    }

    public void performTask() {
        removeAnimals();
        cleanPen();
        addAnimals();
    }

    private void removeAnimals() {
        System.out.println("Removing animals");
    }

    private void cleanPen() {
        System.out.println("Cleaning the pen");
    }

    private void addAnimals() {
        System.out.println("Adding animals");
    }
}
