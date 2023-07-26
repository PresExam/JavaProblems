package problems.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToFile {
    public static void main(String[] args) throws IOException {
        FileWriter obj = new FileWriter("C:\\Users\\student.DESKTOP-N872A1D.000\\Desktop\\java\\problems\\filehandling\\Check", true);
        obj.append("\nHello Presidency");
        obj.close();
        System.out.println("Data successfully written in the File");
    }
}
