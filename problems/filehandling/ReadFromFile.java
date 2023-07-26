package problems.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        File obj = new File("C:\\Users\\student.DESKTOP-N872A1D.000\\Desktop\\java\\problems\\filehandling\\Check");
        Scanner read = new Scanner(obj);
        while (read.hasNextLine()) {
            String data = read.nextLine();
            System.out.println(data);
        }
        read.close();
    }
}