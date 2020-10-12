package Collections.ListConcepts;

import Interview_Questions.Array;
import sun.font.LayoutPathImpl;
import sun.management.snmp.jvmmib.EnumJvmMemPoolCollectThreshdSupport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Practice_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1,5,4,3,2,6,7,8,9));

        Collections.sort(numbers);

        System.out.println(numbers);

        numbers.removeIf(p->p<6);

        System.out.println(numbers);

        numbers.add(10);
        System.out.println(numbers);

        System.out.println("=================================================");

        Employee em1 = new Employee("Agit",30,"QA");
        Employee em2 = new Employee("Muho",26,"SDET");
        Employee em3 = new Employee("Nadir",36,"QA");

        ArrayList<Employee> e1 = new ArrayList<>();
        e1.addAll(Arrays.asList(em1,em2,em3));

//        Iterator<Employee> it = e1.iterator();
//        while(it.hasNext()){
//            Employee emp = it.next();
//            System.out.println(emp.name);
//            System.out.println(emp.age);
//            System.out.println(emp.department);
//        }

        for(Employee eachEmployee : e1){
            System.out.println(eachEmployee.name+" : "+eachEmployee.age+" : "+eachEmployee.department);
        }

        System.out.println("============================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Suleyman","Ahmet","Selma","Agit"));

        for(int i=0; i<names.size(); i++){
            System.out.print("Name: "+names.get(i)+", ");
        }

        System.out.println();

        names.removeIf(p->p.contains("a"));

        System.out.println(names);

        System.out.println("===============================================");





    }
}
