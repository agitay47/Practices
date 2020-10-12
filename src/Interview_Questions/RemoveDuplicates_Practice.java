package Interview_Questions;

public class RemoveDuplicates_Practice {
    public static void main(String[] args) {
        String str="AABBCCDD";
        String result="";

        for(int i=0; i<str.length(); i++){
            if(!result.contains(""+str.charAt(i))){
                result+=""+str.charAt(i);
            }
        }
        System.out.println(result);

        System.out.println("*************************************");

        String arr = "DDEEFFGH";

        String result2="";

        for(int k=0; k<arr.length(); k++){
            if(!result2.contains(""+arr.charAt(k))){

                result2 +=""+arr.charAt(k);
            }
        }

        System.out.println(result2);

        System.out.println("==================================");

        String s = "aabbcc";
        String store="";

        for(int i=0; i<s.length(); i++){
            if(!store.contains(""+s.charAt(i))){
                store +=""+s.charAt(i);
            }
        }

        System.out.println(store); //abc

        System.out.println("=========================================================");

        String s2 = "kkmmnopr";
        String repo=""; //empty string/ we will add non duplicate chars

        for(int i=0; i<s2.length(); i++){
            if(!repo.contains(""+s2.charAt(i))){//it is char so we have to convert to string
                repo +=""+s2.charAt(i); //if they are not contain in repo we should add them
            }
        }
        System.out.println(repo); //kmnopr





    }
}
