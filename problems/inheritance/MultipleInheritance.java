package problems.inheritance;

interface Chrome{ }
interface Brave{ }
interface Edge{ }
class Browsers implements Chrome, Brave, Edge{
    public void chrome(){
        System.out.println("Chrome Browser");
    }
    public void brave(){
        System.out.println("Brave Browser");
    }
    public void edge(){
        System.out.println("Edge Browser");
    }
}
public class MultipleInheritance extends Browsers {
    public static void main(String[] args) {
        MultipleInheritance mi = new MultipleInheritance();
        mi.chrome();
        mi.brave();
        mi.edge();
    }
}
