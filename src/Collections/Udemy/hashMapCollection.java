package Collections.Udemy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashMapCollection {
    public static void main(String[] args) {

        HashMap<Integer,String> employeeIDNameMap = new HashMap<Integer, String>();

        employeeIDNameMap.put(100,"John Doe");
        employeeIDNameMap.put(200,"Agit");
        employeeIDNameMap.put(300,"Ferat");

        //First Approach
        Iterator ite= employeeIDNameMap.entrySet().iterator();

        while (ite.hasNext()) {
            Map.Entry<Integer, String> keyvalue = (Map.Entry<Integer, String>) ite.next();
            System.out.println(keyvalue.getKey()+" "+keyvalue.getValue());
        }
        System.out.println("==============================================================");

        //Second approach
        for(Map.Entry<Integer,String> entry : employeeIDNameMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }



    }
}
