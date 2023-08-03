package problems.sd;

import java.io.*;

class Students implements Serializable{
    private int id;
    private String name;
    private int age;

    public Students(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
public class SDemo {
    public static void main(String[] args) {
        Students s1 = new Students(101, "Geet Raj", 21);
        try{
            FileOutputStream fos = new FileOutputStream("s1.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            System.out.println("Object Serialized Successfully");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}