package az.et.lesson03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolApp {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
    }
}
