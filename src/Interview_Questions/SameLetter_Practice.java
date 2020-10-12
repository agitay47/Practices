package Interview_Questions;

import java.util.Arrays;

public class SameLetter_Practice {
    public static void main(String[] args) {
        String s = "abcde";
        String s2= "abcde";

     //   System.out.println(s.equalsIgnoreCase(s2)); //true

        char[] ch1 = s.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String x=""; //i will add chars  of ch1
        String y=""; // i will add chars of ch2

        for(char each : ch1){
            x +=each;
        }
        for(char each : ch2){
            y +=each;
        }

        System.out.println(x.equalsIgnoreCase(y)); //true

        System.out.println("======================================================");

        String m = "xzy";
        String n = "acb";

        char [] c = m.toCharArray();
        char [] d = n.toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);

       String st = "";
       String st2="";

       for(char each : c){
           st +=each;
       }
       for(char each : d){
           st2 +=each;
       }

        System.out.println(st.equalsIgnoreCase(st2)); //false

    }
}
