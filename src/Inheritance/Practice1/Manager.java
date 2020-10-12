package Inheritance.Practice1;

public class Manager extends Member{

    public String department;

    public Manager(String name, int age, long phoneNumber, String address, double salary,String department) {
        setInfo(name,age,phoneNumber,address,salary);
        this.department = department;
    }


}
