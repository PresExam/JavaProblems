package problems.abstraction;

abstract class Animal{
    abstract void sound();
    void run(){
        System.out.println("I am running...");
    }
}
class Tiger extends Animal{
    @Override
    void sound() {
        System.out.println("I am a Tiger, I have loud voice...");
    }
}
class Turtle extends Animal{
    @Override
    void sound() {
        System.out.println("I am a Turtle, I have low voice...");
    }
}
public class AbsDemo {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sound();
        t.run();
        System.out.println();
        Turtle tu = new Turtle();
        tu.sound();
        tu.run();
    }
}
