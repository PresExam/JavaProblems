package problems.sd;

import java.io.*;

class Student {
    private int id;
    private String name;
    private transient int age;
    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "Student{"+
                "id = "+id+
                "name = "+name+
                "age  = "+age+"}";
    }
}

public class DDemo {
    public static void main(String[] args) {
        try{
            FileInputStream fos = new FileInputStream("s1.ser");
            ObjectInputStream oos = new ObjectInputStream(fos);

            Student DDemo = (Student) oos.readObject();
            System.out.println("Deserialized Object");
        }
        catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
