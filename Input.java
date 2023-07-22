// WAP to display the first 10 terms of fibonnaci series by using recursion

package problems;

import java.util.Scanner;

public class Input {
    static int fibo(int n) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter 1st Number : ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd Number : ");
            int b = sc.nextInt();
            System.out.print("Enter 3rd Number : ");
            int c = sc.nextInt();
            System.out.print("Fibonacci Series : ");
            for (int i = 1; i <= n; i++) {
                int d = a + b + c;
                System.out.print(d + " ");
                a = b;
                b = c;
                c = d;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.print("Enter number of times to print the sum : ");
        try (Scanner sc = new Scanner(System.in)) {
            int nn = sc.nextInt();
            fibo(nn);
        }
    }
}