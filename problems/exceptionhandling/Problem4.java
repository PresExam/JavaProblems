package problems.exceptionhandling;

public class Problem4 {
    static void ageCheck(int age) {
        if (age >= 18)
            System.out.println("Access Granted - You are eligible");
        else
            throw new ArithmeticException("Access Denied - Age is less than 18 yrs");
    }

    public static void main(String[] args) {
        ageCheck(20);
    }
}
