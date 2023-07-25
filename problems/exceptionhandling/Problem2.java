package problems.exceptionhandling;

public class Problem2 {
    public static void main(String[] args) {
        try{
            int i = 20;
            int j = 10;
            int k = i/j;
            System.out.println(k);
            int num[] = {7,4,1,8,5,2};
            System.out.println(num[5]);
        }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("Division not possible");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("Invalid index of Array");
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Check");
        }
    }
}
