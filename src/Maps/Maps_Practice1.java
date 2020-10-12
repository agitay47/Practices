package Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;

public class Maps_Practice1 {

    public static void main(String[] args) {

        LinkedHashMap<String, LocalDate>  classMates = new LinkedHashMap<>();  //"Muhtar"
        classMates.put("Taha" , LocalDate.of(1998, 07, 16) );
        classMates.put("Anil", LocalDate.of(1453,01,01));
        classMates.put("Saban", LocalDate.of(1900, 01, 30));
        classMates.put("Anna", LocalDate.of(1990,2,28));
        classMates.put("Namik", LocalDate.of(1453,01,01));
        classMates.put("Yucel", LocalDate.of(2005, 12, 28));

        classMates.put("Namik", LocalDate.of(1990, 4, 5));
        classMates.put("Anil", LocalDate.now());

        System.out.println(classMates);//{Taha=1998-07-16, Anil=2020-10-02, Saban=1900-01-30, Anna=1990-02-28, Namik=1990-04-05, Yucel=2005-12-28}

        classMates.remove("Anil");
        System.out.println(classMates);//{Taha=1998-07-16, Saban=1900-01-30, Anna=1990-02-28, Namik=1990-04-05, Yucel=2005-12-28}

        System.out.println( classMates.get("Namik") ); //1990-04-05

        boolean r1 = classMates.containsKey("Anna");
        System.out.println(r1); //true

        boolean r2 =  classMates.containsValue( LocalDate.of(1990,4,5) );
        System.out.println(r2);//true


        classMates.clear();
        System.out.println(classMates);//{}

        System.out.println("=======================================");

        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("Adil",92);
        students.put("Hunar",89);
        students.put("Barzy",75);
        students.put("Rahman",93);
        students.put("Hardi",80);

        LinkedHashMap<String, Integer> badStudents = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> goodStudents = new LinkedHashMap<>();

        for( String eachKey   : students.keySet()  ){
            int eachValue = students.get(eachKey);  // score

            if( eachValue < 90){
                badStudents.put(eachKey, eachValue );
            }else{
                goodStudents.put(eachKey, eachValue );
            }
        }


        System.out.println(badStudents);//{Hunar=89, Barzy=75, Hardi=80}
        System.out.println(goodStudents);//{Adil=92, Rahman=93}








    }

}