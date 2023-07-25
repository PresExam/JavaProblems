// Implement a program to demonstrate the use of classes and objects in java

package problems.classobject;

class hello{
    String name;
    int empID;
    String dept;
    int sal;
}
class ClaObj {
    public static void main(String[] args) {
        hello h1 = new hello();
        h1.name = "RAVAN";
        h1.empID = 2001;
        h1.dept = "IT";
        h1.sal = 200000;
        hello h2 = new hello();
        h2.name = "ROHIT";
        h2.empID = 2002;
        h2.dept = "Finance";
        h2.sal = 180000;

        System.out.println("Details of 1st Employee : ");
        System.out.println("Name : "+h1.name);
        System.out.println("EmpID : "+h1.empID);
        System.out.println("Department : "+h1.dept);
        System.out.println("Salary : "+h1.sal);
        System.out.println();
        System.out.println("Details of 2nd Employee : ");
        System.out.println("Name : "+h2.name);
        System.out.println("EmpID : "+h2.empID);
        System.out.println("Department : "+h2.dept);
        System.out.println("Salary : "+h2.sal);
    }
}