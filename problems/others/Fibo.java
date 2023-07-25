// WAP to display the first 10 terms of fibonnaci series by using recursion

package problems.others;

import java.util.Scanner;

public class Fibo {
    static int fibo(int n) {
        int a = 0, b = 1, c;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        return n;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int nn = sc.nextInt();
            fibo(nn);
        }
    }
}