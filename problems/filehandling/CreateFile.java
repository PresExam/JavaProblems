package problems.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File obj = new File("C:\\Users\\student.DESKTOP-N872A1D.000\\Desktop\\java\\problems\\filehandling\\Check");
        try{
            if (obj.createNewFile())
                System.out.print("File created successfully : " + obj.getName());
            else
                System.out.print("File already exists");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
