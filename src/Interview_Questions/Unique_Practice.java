package Interview_Questions;

public class Unique_Practice {
    public static void main(String[] args) {
        String str = "ABABCDDEFFGHHIJJK";
        String expectedResult = "";  // "C"

        // str = "ABABC";

        for(int j = 0; j < str.length() ; j++){

            char ch = str.charAt(j); // A B A B C
            int count = 0 ; // frequency of ch

            for(int i = 0; i < str.length(); i++){  //helps us to calculate the frequency of ch and assign it to count
                char each =  str.charAt(i);
                if(each == ch){
                    count+=1;
                }
            }

            if(count == 1){   //unique
                expectedResult += ch;
            }

        }



        System.out.println(expectedResult);

        System.out.println("==============================================================");
        String s1 = "AABCCDDF";

       for(int i=0; i<s1.length(); i++){
           int count =0;

           for(int j=0; j<s1.length(); j++){
             if(s1.charAt(i)==s1.charAt(j)){
                 count++;
             }
           }
           if(count==1){
               System.out.print(s1.charAt(i));
           }
       }
        System.out.println();
        System.out.println("====================================================================");

       String s2 = "ssppa";

       for(int i=0; i<s2.length(); i++){
           int count =0;
           for(int k=0; k<s2.length(); k++){
               if(s2.charAt(i)==s2.charAt(k)){
                   count++;
               }
           }
           if(count==1){
               System.out.print(s2.charAt(i)); //a
           }
       }
        System.out.println();
        System.out.println("===================================================================");


    }
}
