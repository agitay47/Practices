package Inheritance.Practice1;

public class MemberObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Muhammed Cakmak",24,9097654311L,"Colorado",119999,"Full Stack Testing Engineer");

        System.out.println(employee1);

        System.out.println("===============NO RACISM==================");

        Manager manager1 = new Manager("Murat Kaplan",27,9999999999L,"CANADA",100000,"Developer");

        System.out.println(manager1);
    }
}
