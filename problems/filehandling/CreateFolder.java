package problems.filehandling;

import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {
        File obj = new File("C:\\Users\\student.DESKTOP-N872A1D.000\\Desktop\\java\\problems\\filehandling\\Check");
        try{
            if (obj.mkdir())
                System.out.print("Folder created successfully : " + obj.getName());
            else
                System.out.print("Folder already exists");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
