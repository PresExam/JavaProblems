// Static Method

package problems.interview.statickeyword;

class Dummy{
    static int add(int a, int b){
        return a+b;
    }
}
public class Problem2 {
    public static void main(String[] args) {
        int result = Dummy.add(4, 5);
        System.out.println("4 + 5 = "+result);
    }
}
