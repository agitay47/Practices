package Encapsulation.Practice2;

public class EmployeeData {
    //how to implement Encapsulation
    //Encapsulation is also called Data Hiding

    //1.private data variables: so that these variables can not accessed directly from outside the class
    private int ssn; //hidden data
    private String empName; //hidden data
    private int empAge; //hidden data

    //getter and setter methods:

    //2. public getter abd setter methods: to set and get the values of the fields
    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public static void main(String[] args) {
        EmployeeData emp = new EmployeeData();
        emp.setEmpName("Tom Peter");
        emp.setEmpAge(25);
        emp.setSsn(123456);

        System.out.println("Employee name is: " + emp.getEmpName());
        System.out.println("Employee age is: " + emp.getEmpAge());
        System.out.println("Employee Ssn is: " + emp.getSsn());


    }


}
