package Interview_Questions;

public class String_Reverse_Practice {
    public static void main(String[] args) {
        String str = "Nusaybin";
        String reverse="";

        for(int i=str.length()-1; i>=0; i--){
            reverse +=""+str.charAt(i);
        }
        System.out.println(reverse); //nibyasuN

        System.out.println("============================");

        String s = "Agit";
        String depo="";

        for(int i=s.length()-1; i>=0; i--){
            depo +=""+s.charAt(i); //convert char to string with ""+
        }
        System.out.println(depo); //tigA









    }
}
