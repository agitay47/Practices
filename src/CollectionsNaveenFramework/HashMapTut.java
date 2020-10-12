package CollectionsNaveenFramework;

import java.util.HashMap;

public class HashMapTut {
    public static void main(String[] args) {
//        int a =10;
//        int b = 3;
//        int  c = 88;
//
//        HashMap<String,Integer> happy = new HashMap<String,Integer>();
//        happy.put("a",10);
//        happy.put("b",3);
//        happy.put("c",88);
//
//        System.out.println(happy.get("c"));

        HashMap<String,String > fun = new HashMap<String,String >();
        fun.put("AgitAy","474747A");
        fun.put("HelloKittyFan","Alovera21");
        fun.put("CoolGy","skdkdkd12");

        System.out.println(fun); //{HelloKittyFan=Alovera21, AgitAy=474747A, CoolGy=skdkdkd12}

      //  fun.remove("HelloKittyFan");

      //  System.out.println(fun); //{AgitAy=474747A, CoolGy=skdkdkd12}

        System.out.println(fun.containsValue("474747A")); //true

        //key-value

        System.out.println(fun.size());//3

        System.out.println(fun.replace("AgitAy","SipelAy"));

        System.out.println(fun); //{HelloKittyFan=Alovera21, AgitAy=SipelAy, CoolGy=skdkdkd12}


    }
}
