package az.et.lesson00;

public class CheckResultsWithSleep {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000000; i++) {
                    CheckResultsWithSleep.counter++;
                }
            }
        })
                .start();

        while (CheckResultsWithSleep.counter < 100) {
            System.out.println("Not reached yet. Counter is: " + CheckResultsWithSleep.counter);
            Thread.sleep(1000);
        }

        System.out.println("Reached. Counter is: " + CheckResultsWithSleep.counter);
    }
}