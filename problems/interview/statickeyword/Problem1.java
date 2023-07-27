// Static Block
package problems.interview.statickeyword;

public class Problem1 {
    {
        System.out.println("This is 1st block");
    }
    public static void main(String[] args) {
        System.out.println("This is main method");
        Problem1 obj = new Problem1();
    }
    static {
        System.out.println("This is 2nd block");
    }
}
