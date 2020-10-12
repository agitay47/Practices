package Interview_Questions;

public class String_Reverse {
    public static void main(String[] args) {
      //solution 1;
        String str="ABCD";
        String reverse="";

        for(int i=str.length()-1; i>=0; i--){
            reverse +=""+str.charAt(i);
        }
        System.out.println(reverse);

       //String str1="ABCDEFGH";
       // System.out.println(StrReverse(str1));

    }
    //solution 2;
    public static String StrReverse(String str) {

        String reverse="";

        for(int i=str.length()-1; i >= 0; i--)

            reverse += str.toCharArray()[i];



        return  reverse;

    }
}
