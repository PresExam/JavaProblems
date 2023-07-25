package problems.encapsulation;
import problems.encapsulation.Emp;
public class Demo {
    public static void main(String[] args) {
        Emp e1 = new Emp("PAVAN", 1001, "IT", 238000);
        Emp e2 = new Emp("ROHIT", 1002, "IT", 189000);

        e1.printDetails();
        System.out.println();
        e2.printDetails();
        System.out.println();
        e1.setName("GEET");
        System.out.println(e1.getName()+" belongs to "+e1.getDept()+ " department \nwith "+e1.getEmpID()+" as Employee ID \nand a Salary of "+e1.getSal());
    }
}
