package problems.classobject;

class Bank{
    String name;
    int empID;
    String dept;
    int sal;
    public Bank(String n, int e, String d, int s) {
        this.name = n;
        this.empID = e;
        this.dept = d;
        this.sal = s;
    }
    public void printDetails(){
        System.out.println("Details of "+this.name);
        System.out.println("EmployeeID : "+this.empID);
        System.out.println("Department : "+this.dept);
        System.out.println("Salary : "+this.sal);
    }
}

class Employee{
    public static void main(String[] args) {
        Bank e1 = new Bank("Pagan",1001,"IT",100000);
        Bank e2 = new Bank("Keesha",1001,"Finance",130000);

        e1.printDetails();
        System.out.println();
        e2.printDetails();
    }
}
