package problems.superkeyword;

class Parent{
    String name;
    Parent(String name){
        this.name = name;
    }
}
class Child extends Parent{
    int age;
    Child(int age, String name){
        super(name);
        this.age = age;
    }
}
public class Example {
    public static void main(String[] args) {
        Child c = new Child(12, "Raj");
        System.out.println("Name : " + c.name);
        System.out.println("Age : " + c.age);
    }
}
