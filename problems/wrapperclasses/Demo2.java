package problems.wrapperclasses;

public class Demo2 {
    public static void main(String[] args) {
        Integer newInteger = 6987;
        Double newDouble = 3.142;
        Character newCharacter = 'A';
        System.out.println(newInteger.doubleValue());
        System.out.println(newDouble.intValue());
        System.out.println(newCharacter);
        System.out.println(newInteger.toString() + newInteger.toString());
        Integer aa = 15;
        System.out.println(aa.toString()+aa.toString());
    }
}