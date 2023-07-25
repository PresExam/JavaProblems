package problems.stringbuffer;

public class Example {
    public void stringAppend(){
        StringBuffer sbf = new StringBuffer("Presidency");
        System.out.println("Old String : " + sbf);
        sbf.append(" University");
        System.out.println("New String : " + sbf);
    }
    public void stringInsert(){
        StringBuffer sbf = new StringBuffer("NIK");
        System.out.println("Old String : " + sbf);
        sbf.insert(3,"ITH");
        System.out.println("New String : " + sbf);
    }
    public void stringReverse(){
        StringBuffer sbf = new StringBuffer("JAR");
        System.out.println("Old String : " + sbf);
        sbf.reverse();
        System.out.println("New String : " + sbf);
    }

    public static void main(String[] args) {
        Example sf = new Example();
        sf.stringAppend();
        sf.stringInsert();
        sf.stringReverse();
    }
}
