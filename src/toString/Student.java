package toString;

public class Student {


    int rollno;
    String name;
    String city;

    Student(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;

    }

    public String toString() {
        return rollno + " " + name + " " + city;
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Raj", "lukcnow");
        Student s2 = new Student(102, "Vijay", "ghaziabad");

        System.out.println(s1); //toString.Student@1b6d3586
        System.out.println(s2); //toString.Student@4554617c

        //after we create public String Tostring
        //101 Raj lukcnow
        //102 Vijay ghaziabad

        Employee e1 = new Employee(01, "Ari", "NewYork");
        Employee e2 = new Employee(02, "Jon", "Chicago");
        System.out.println(e1); //1 Ari NewYork
        System.out.println(e2); //2 Jon Chicago
    }

    public static class Employee {
        int id;
        String name;
        String city;

        Employee(int id, String name, String city) {
            this.id = id;
            this.name = name;
            this.city = city;
        }

        public String toString() {//overriding the toString() method
            return id + " " + name + " " + city;
        }

    }
}