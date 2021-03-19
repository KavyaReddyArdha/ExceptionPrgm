public class Interrupt extends Thread {
    public void run() {
        try {
            Thread.sleep(50000);
            System.out.println("This is Interrupted Exception");
        } catch (InterruptedException i) {
            i.printStackTrace();
        }
    }
    public static void main(String args[]) {
        Interrupt in = new Interrupt();
        in.start();
        try {
            in.interrupt();
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}