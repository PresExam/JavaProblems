package problems.exceptionhandling;

public class Problem1 {
    public static void main(String[] args) {
        try{
            int i = 20;
            int j = 0;
            int k = i/j;
            System.out.println(k);
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Wrong Input, can't be divided by zero");
        }
    }
}

