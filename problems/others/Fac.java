// WAP to find the factorial of a number using recursion

package problems.others;

import java.util.Scanner;

public class Fac {
    static int fac(int n) {
        if (n == 0)
            return 1;
        else
            return n * fac(n - 1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\n\t Enter a number to find the factorial : ");
            int n = sc.nextInt(), fact_n;
            fact_n = fac(n);
            System.out.println("\n\t Factorial of " + n + " is : " + fact_n + "\n");
        }
    }
}
