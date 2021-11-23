package az.et.lesson00;

public class CheckResults {
    private static int counter = 0;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 500; i++) {
                    CheckResults.counter++;
                }
            }
        })
                .start();

        while (CheckResults.counter < 100) {
            System.out.println("Not reached yet. Counter is: " + CheckResults.counter);
        }

        System.out.println("Reached. Counter is: " + CheckResults.counter);
    }
}