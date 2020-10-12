package Inheritance.Practice6;

import java.util.ArrayList;
import java.util.Arrays;

public class Google {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Muhammed",21,'M',"A007","SDET",120000);
        Tester tester2 = new Tester("Murat",24,'M',"B007","QA",110000);
        Tester tester3 = new Tester("Fatma",28,'F',"C007","SDET",100000);
        Tester tester4 = new Tester("Erkan",28,'M',"D007","SDET",130000);
        Tester tester5 = new Tester("Julia",20,'F',"J007","QA",149000);

        Developer dev1 = new Developer("Semsettin",45,'M',"S007","Full Stack Developer",150000);
        Developer dev2 = new Developer("Vesile",30,'F',"V007","Front-End Developer",99000);
        Developer dev3 = new Developer("Ferat",31,'M',"F007","Back-End Developer",130000);
        Developer dev4 = new Developer("Nuriye",24,'F',"N007","Developer",130000);
        Developer dev5 = new Developer("Naveen",34,'M',"NA007","Dev Lead",150000);


        ArrayList<Tester> testers = new ArrayList<>();
        testers.addAll(Arrays.asList(tester1,tester2,tester3,tester3,tester4,tester5));

        ArrayList<Developer> developers = new ArrayList<>();
        developers.addAll(Arrays.asList(dev1,dev2,dev3,dev4,dev5));

        String testerName = "";
        double maxSalaryForTester = Double.MIN_VALUE;
        for(Tester each : testers){
            if(each.salary > maxSalaryForTester) {
                maxSalaryForTester = each.salary;
                testerName = each.name;
            }
        }

        System.out.println("Tester who gets maximum salary is: "+maxSalaryForTester); //149000.0
        System.out.println("Tester name: "+testerName);

        System.out.println("==========================================================================");

        String developerName = "";
        double maxSalaryForDeveloper = Double.MIN_VALUE;
        for(Developer each : developers){
            if(each.salary > maxSalaryForDeveloper) {
                maxSalaryForDeveloper = each.salary;
                developerName = each.name;
            }
        }

        System.out.println("Developer who gets maximum salary is: "+maxSalaryForDeveloper);//150000.0
        System.out.println("Developer name: "+developerName);

    }
}
