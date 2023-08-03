package problems.multithreading;

class BankAcc{
    private int balance;
    public BankAcc(int initialBalance){
        this.balance = initialBalance;
    }
    public synchronized void deposit(int amount){
        int newBalance = balance + amount;
        System.out.println("Depositing ₹ : "+amount+" New Balance ₹ : "+newBalance);
        balance = newBalance;
    }
    public int getBalance(){
        return balance;
    }
}
class Depositor implements Runnable{
    private BankAcc account;
    private int amount;
    public Depositor(BankAcc account, int amount){
        this.account = account;
        this.amount = amount;
    }
    public void run(){
        account.deposit(amount);
    }
}
public class ThreadSync {
    public static void main(String[] args) {
        BankAcc account = new BankAcc(5000);
        Thread depo1 = new Thread(new Depositor(account, 1500));
        Thread depo2 = new Thread(new Depositor(account, 2000));

        depo1.start();
        depo2.start();

        //Wait for the threads to finish
        try{
            depo1.join();
            depo2.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        // After Synchronization
        System.out.println("Final Balance ₹ : "+account.getBalance());
    }
}
