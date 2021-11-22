package az.et.lesson00;

public class PrintData implements Runnable {
    public static void main(String[] args) {
        System.out.println("=====================");
        System.out.println("Start");
        (new Thread(new PrintData())).start();
        System.out.println("End");
        System.out.println("=====================");
    }

    @Override
    public void run() {
        System.out.println("Print data class implements 'Runnable' interface. More Useful :)");
    }
}
