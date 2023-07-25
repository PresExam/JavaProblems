package problems.composition;

public class Composition {
    public static void main(String[] args) {
        Human h1 = new Human("Nikhil");
        Cat c1 = new Cat("Ruby", h1);

        System.out.println(h1);
        System.out.println(c1);
    }
}
