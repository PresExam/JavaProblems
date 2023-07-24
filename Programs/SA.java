//WAP to split a String into an array of Strings
// And also show how we can remove the spaces from a string

package Practice;

public class SA {
    public static void main(String[] args) {
        String name = "Geet1Raj";
        String word = "       Geet Raj     ";
        String[] names = name.split("1");
        for (String naam : names) {
            System.out.println(naam);
        }
        System.out.println(word.trim());
    }
}
