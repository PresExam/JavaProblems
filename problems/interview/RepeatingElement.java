package problems.interview;

public class RepeatingElement {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,4,5,6,5,4,3};
        int a = 0;
        for(int i=0; i<arr.length; i++)
            a = a ^ arr[i];
        System.out.println("The non repeating element is : " + a);
    }
}
