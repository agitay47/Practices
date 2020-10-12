package Static;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Student Agit = new Student();
        Student Muhammed = new Student();
        Student Ibrahim = new Student();

        Agit.studentInfo("Agit","SDET",3.45,"Cybertek");
        Muhammed.studentInfo("Muhammed","QA",3.25,"Cybertek");
        Ibrahim.studentInfo("Ibrahim","Developer",2.1,"Cybertek");

        ArrayList<Student> students = new ArrayList<>();

        students.addAll(Arrays.asList(Agit,Muhammed,Ibrahim));




      //  students.removeIf(p->p.name.startsWith("M"));
       // students.removeIf(p->p.major !="SDET");
       // students.removeIf(p->p.gpa<3.00);
        students.removeIf(p->!p.isOnHonorRoll());

        for(Student each : students){
            System.out.println(each.toString());
        }












    }
}
