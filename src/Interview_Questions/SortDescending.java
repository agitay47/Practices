package Interview_Questions;

import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {

        int [] arr={100,300,200,600,500,400};

        Arrays.sort(arr);

        int [] arr2 = new int[arr.length];

        int k=arr.length-1;
        for(int i=0; i<=arr2.length-1; i++){
            arr2[i] = arr[k];

            k--;
        }

        System.out.println(Arrays.toString(arr2)); //[600, 500, 400, 300, 200, 100]


        int [] in = {1,6,3,2,4,5,7,9,8};

        Arrays.sort(in);
        System.out.println(Arrays.toString(in));//[1, 2, 3, 4, 5, 6, 7, 8, 9]

        int [] x = new int[in.length];

        int j=in.length-1;

        for(int i=0; i<=x.length-1; i++){
            x[i]=in[j];
            j--;
        }

        System.out.println(Arrays.toString(x));  //[9, 8, 7, 6, 5, 4, 3, 2, 1]













    }
}
