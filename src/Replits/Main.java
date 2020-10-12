package Replits;
/*This may be confusing so look at the example:
first_names = {"Bulent","Ebrahim"}
last_names = {"Pola","Emam"}

returns a new String array with {"Bulent Pola",  "Ebrahim Emam"} */

import java.util.Arrays;

class Main {

    public static String[] combineNames(String[] first_names, String[] last_names)
    {


        String [] combineArray = new String[first_names.length];

        for (int i=0; i<first_names.length;i++) {
            combineArray[i] = first_names[i] + " " + last_names[i];
        }
        return combineArray;
    }



    public static void main(String[] args)
    {
        //feel free to test code here
            String[] first_names = {"Junior ","Joe"};
            String[] last_names = {"Trump","Biden"};
            combineNames(first_names, last_names);
            System.out.println(Arrays.asList(combineNames(first_names,last_names)));


    }
}

