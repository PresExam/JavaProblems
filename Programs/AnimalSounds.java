package problems;

class Animals{
    void makesound(){
        System.out.println("Hello...");
    }
}
class Cat extends Animals{
    void makesound(){
        System.out.println("Meow Meow....");
    }
}
class PersianCat extends Cat{
    void makessound(){
        System.out.println("Meau Meau...");
    }
}
public class AnimalSounds {
    public static void main(String[] args) {
        Animals a = new Animals();
        Cat c = new Cat();
        PersianCat pc = new PersianCat();

        a.makesound();
        c.makesound();
        pc.makessound();
    }
}
