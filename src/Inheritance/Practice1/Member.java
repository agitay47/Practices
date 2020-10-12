package Inheritance.Practice1;

public class Member {
    public String name;
    public int age;
    public long phoneNumber;
    public String address;
    public double salary;

    public void setInfo(String name, int age, long phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary(){
        System.out.println("Your salary is: "+salary);
    }


    public String toString() {
      return "================================================================"
              +"\nName: "+name+"\nAge: "+age+"\nPhone number: "+phoneNumber+"\nAddress: "+address+"\nSalary: $"+salary;
    }
}
