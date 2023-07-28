package problems.generics;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        int first = numbers.get(0);
        int second = numbers.get(1);
        int third = numbers.get(2);

        System.out.println("First : "+first+" Second : "+second+" Third : "+third);

        ArrayList<String> names = new ArrayList<String>();
        names.add("Rakesh");
        names.add("Nikita");
        names.add("D Murthy");

        String name1 = names.get(0);
        String name2 = names.get(1);
        String name3 = names.get(2);

        System.out.println("First Name : "+name1+" Second Name : "+name2+" Third Name : "+name3);
    }
}
