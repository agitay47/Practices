package Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Intro {

    public static void main(String[] args) {
        Map<String, Double> employeeInfo = new LinkedHashMap<>();
        employeeInfo.put( "Zarina", 120000.0 );
        employeeInfo.put("Bakhodir", 110000.50);

        System.out.println(employeeInfo); //{Zarina=120000.0, Bakhodir=110000.5}
        System.out.println( employeeInfo.size() ); //2

        System.out.println( employeeInfo.get("Zarina") ); //120000.0
        System.out.println( employeeInfo.get("Bakhodir") );//110000.5

        employeeInfo.remove("Bakhodir");//{Zarina=120000.0}

        System.out.println(employeeInfo);//{Zarina=120000.0}
        System.out.println(employeeInfo.size());//1

        employeeInfo.put("Zarina", 130000.0);

        System.out.println(employeeInfo); //{Zarina=130000.0}












    }


}