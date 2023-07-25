package problems.accessmodifier;

class Example{
    private int privateVar = 10;
    public int publicVar = 20;
    protected int protectedVar = 30;
    int defaultVar = 40;
    private void privateMethod(){
        System.out.println("Private");
    }
    public void publicMethod(){
        System.out.println("Public");
    }
    protected void protectedMethod(){
        System.out.println("Protected");
    }
    void defaultMethod(){
        System.out.println("Default");
    }
    void hello(){
        System.out.println(privateVar);
        privateMethod();
    }
}
public class AccessModifier {
    public static void main(String[] args) {
        Example ex = new Example();

        ex.hello();

        System.out.println(ex.publicVar);
        ex.publicMethod();

        System.out.println(ex.protectedVar);
        ex.protectedMethod();

//        System.out.println(ex.privateVar);
//        ex.privateMethod();

        System.out.println(ex.defaultVar);
        ex.defaultMethod();
    }
}
