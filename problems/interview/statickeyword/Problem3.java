// Static Variable
package problems.interview.statickeyword;

public class Problem3 {
    static int i = 0;
    static void function(){
        int j = 0;
        i++;
        j++;
        System.out.println("i = "+i+"\t j  = "+j);
    }

//    static void function(){
//        int i = 0;
//        int j = 0;
//        i++;
//        j++;
//        System.out.println("i = "+i+"\t j  = "+j);
//    }

    public static void main(String[] args) {
        function();
        function();
        function();
        function();
        function();
        function();
        function();
    }
}
