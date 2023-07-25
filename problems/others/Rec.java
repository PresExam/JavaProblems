// WAP find the sum of first 10 natural numbers by implementing recursion

package problems.others;

public class Rec {
    static int rec() {
        int a = 0;
        for (int i = 1; i <= 10; i++) {
            a = a + i;
        }
        return a;
    }

    public static void main(String[] args) {
        int b = rec();
        System.out.println(b);
    }
}