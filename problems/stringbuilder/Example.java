package problems.stringbuilder;

public class Example {
    public void stringAppend(){
        StringBuilder sbl = new StringBuilder("Presidency");
        System.out.println("Old String : " + sbl);
        sbl.append(" University");
        System.out.println("New String : " + sbl);
    }
    public void stringInsert(){
        StringBuilder sbl = new StringBuilder("NIK");
        System.out.println("Old String : " + sbl);
        sbl.insert(3,"ITH");
        System.out.println("New String : " + sbl);
    }
    public void stringReverse(){
        StringBuilder sbl = new StringBuilder("JAR");
        System.out.println("Old String : " + sbl);
        sbl.reverse();
        System.out.println("New String : " + sbl);
    }

    public static void main(String[] args) {
        Example sb = new Example();
        sb.stringAppend();
        sb.stringInsert();
        sb.stringReverse();
    }
}