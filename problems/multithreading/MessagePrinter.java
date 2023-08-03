package problems.multithreading;

public class MessagePrinter implements Runnable{
    public void run(){
        for(int i=1; i <= 5; i++) {
            System.out.println("Message " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MessagePrinter m1 = new MessagePrinter();
        Thread t = new Thread(m1);
        t.start();
    }
}
