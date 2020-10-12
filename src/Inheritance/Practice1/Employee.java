package Inheritance.Practice1;

public class Employee extends Member{

    public String specialization;

    public Employee(String name, int age, long phoneNumber, String address, double salary,String specialization) {

        setInfo(name,age,phoneNumber,address,salary);
        this.specialization = specialization;
    }

}
