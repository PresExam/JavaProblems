// Wrapper Classes
package problems.wrapperclasses;

public class Demo1 {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = num; // Boxing
        System.out.println(num1);

        int num2 = num1.intValue(); // Unboxing
        System.out.println(num2);

        int num3 = num1; // Auto Unboxing

        String str = "56";
        int num4 = Integer.parseInt(str); // Auto Boxing
        System.out.println(num4-num3);
    }
}