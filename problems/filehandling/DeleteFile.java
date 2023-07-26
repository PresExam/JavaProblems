package problems.filehandling;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File obj = new File("C:\\Users\\student.DESKTOP-N872A1D.000\\Desktop\\java\\problems\\filehandling\\Check");
        try{
            if (obj.delete())
                System.out.print("Deleted successfully : " + obj.getName());
            else
                System.out.print("Doesn't exists");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
