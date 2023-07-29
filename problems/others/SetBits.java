// Count the number of set bits for a given +ve integer
package problems.others;

import java.util.Scanner;

public class SetBits {
    static int setbitscount(int n) {
        int count = 0;
        while(n > 0){
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int a = sc.nextInt();
        System.out.print("Number of Set Bits : "+setbitscount(a));
    }
}
