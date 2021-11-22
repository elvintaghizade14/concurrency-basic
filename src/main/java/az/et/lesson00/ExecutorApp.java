package az.et.lesson00;

public class ExecutorApp {
    public static void main(String[] args) {
        System.out.println("=====================");
        System.out.println("begin");
        (new ReadInventoryThread()).start();
        (new Thread(new PrintData())).start();
        (new Thread(new PrintData())).start();
        (new ReadInventoryThread()).start();
        (new Thread(new PrintData())).start();
        System.out.println("end");
        System.out.println("=====================");
    }
}
