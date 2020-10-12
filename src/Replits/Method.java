package Replits;

public class Method {
    public static void main(String[] args) {
        String [] arr={"a","foo","bar","foo","bla"};
       

    }
    public int  count_appearance(String[] arr,String t){


        int count=0;


        for(String each : arr){
            if(each.equals(arr)){
                count++;
            }

        }


return count;
    }
}
