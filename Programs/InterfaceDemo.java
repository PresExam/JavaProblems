package problems;

interface animal{
    void size();
    void color();
}
class lion implements animal{
    public void size(){
        System.out.println("I am lion...my size is huge");
    }
    public void color() {
        System.out.println("I am lion...my color is brown");
    }
}
class rabbit implements animal{
    public void size(){
        System.out.println("I am rabbit...my size is small");
    }
    public void color() {
        System.out.println("I am rabie...my color is white");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        lion l = new lion();
        rabbit r = new rabbit();
        l.size();
        l.color();
        r.size();
        r.color();
    }
}
