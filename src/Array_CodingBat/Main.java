package Array_CodingBat;

class Main
{
    public static void main(String[] args)
    {
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };

        int[] sums = rowSums(a);

        for(int sum : sums)
            System.out.println(sum);
        //this should print 4 6 11 3
    }

    public static int[] rowSums(int[][] nums) {
        // write your codes here
        int[] arr = new int[nums.length];
        for (int b = 0; b < nums[0].length; b++) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] += nums[i][b];
            }
        }
        return arr;
    }


    }