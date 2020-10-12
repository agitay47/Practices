package Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Map_SetEntries {

    public static void main(String[] args) {
        LinkedHashMap<String, String> fb = new LinkedHashMap<>();
        fb.put("Tester01", "password1");
        fb.put("Tester02", "password1");
        fb.put("Tester02", "password2");
        fb.put("Tester03", "password3");
        fb.put("Tester04", "password4");
        fb.put("Tester05", "password5");

        System.out.println(fb);//{Tester01=password1, Tester02=password2, Tester03=password3, Tester04=password4, Tester05=password5}

        System.out.println("======================================");

        for( String  eachKey   :  fb.keySet() ){
            //  System.out.println(eachKey +"  " +fb.get(eachKey));
            System.out.println(eachKey);
        }
        List<String> usernames = new ArrayList<>(fb.keySet());
        System.out.println(usernames); //[Tester01, Tester02, Tester03, Tester04, Tester05]

        System.out.println("=======================================");

        for(String eachValue : fb.values()){
            System.out.println(eachValue);
        }

        List<String> passwords = new ArrayList<>(fb.values());
        System.out.println(passwords);//[password1, password2, password3, password4, password5]

        System.out.println("=======================================");


    }

}