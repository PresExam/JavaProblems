package problems.encapsulation;

class Emp{
    String name;
    int empID;
    String dept;
    int sal;
    public Emp(String n, int e, String d, int s) {
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
    public void setName(String name){
        this.name = name;
    }
    public void setDept(String dept){
        this.dept = dept;
    }
    public void setEmpID(int empID){
        this.empID = empID;
    }
    public void setSal(int sal){
        this.sal = sal;
    }
    public String getName(){
        return this.name;
    }
    public String getDept(){
        return this.dept;
    }
    public int getEmpID(){
        return this.empID;
    }
    public int getSal(){
        return this.sal;
    }
}

