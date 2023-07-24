package Practice;

public class JaggedArray {
    public static void main(String[] args) {
        int JA[][] = { { 7, 4, 1 }, 
                        { 8, 5, 2, 0, 9, 6, 5, 4 }, 
                        { 1, 4, 7, 8, 5 } };
        for (int i = 0; i < JA.length; i++) {
            for (int j = 0; j < JA[i].length; j++) {
                System.out.print(JA[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
