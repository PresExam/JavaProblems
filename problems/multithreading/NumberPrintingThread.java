package problems.multithreading;

public class NumberPrintingThread extends Thread {
    public void run(){
        for(int i=1; i<=5; i++)
            System.out.println(i);
    }
    public static void main(String[] args) {
        NumberPrintingThread obj = new NumberPrintingThread();
        obj.start();
    }
}
