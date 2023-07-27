package problems.interview;

import java.util.Scanner;

public class GeetRaj {
    static int fact(int n){
        if (n == 0)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many days left to join : ");
        int days = sc.nextInt();
        System.out.println(fact(days));
    }
}
