package az.et.lesson00;

public class ReadInventoryThread extends Thread {
    public static void main(String[] args) {
        System.out.println("=====================");
        System.out.println("Start");
        new ReadInventoryThread().start();
        System.out.println("End");
        System.out.println("=====================");
    }

    @Override
    public void run() {
        System.out.println("Read inventory thread class extends 'Thread' class. Useless :(");
    }
}