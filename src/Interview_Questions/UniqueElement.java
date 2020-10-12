package Interview_Questions;

public class UniqueElement {
    public static void main(String[] args) {

        int [] arr={1,1,3,4,4,5,6,6};

        //lets find unique number

       for(int each : arr){

           int count=0;
           for(int x : arr){
               if(each==x){
                  count++;
               }
           }
           if(count==1){
               System.out.print(each+" ");  //3,5
           }


       }

        System.out.println();
       int [] x ={11,12,12,13,14,14,14,15};


       for(int each : x){
           int count=0;
           for(int y : x){
               if(each==y){
                   count++;
               }
           }
           if(count==1){
               System.out.print(each+" ");
           }
       }














    }
}
