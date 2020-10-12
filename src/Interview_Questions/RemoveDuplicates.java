package Interview_Questions;

public class RemoveDuplicates {
    public static void main(String[] args) {


        String str="AABBCCDDDEE";

        String s=removeDup(str);
        System.out.println(s);

    }
    public static String removeDup(String str){

        String result="";
        for(int i=0; i<str.length(); i++){
            if(!result.contains(""+str.charAt(i))){
                result+="" + str.charAt(i);
            }
        }

     return result;

    }
}
