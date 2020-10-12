package Collections.SetConcept;
// according to insertion order and insertion time

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class Differences {
    public static void main(String[] args) {

        LinkedHashSet<String> geekLinkSet
                = new LinkedHashSet<>();
        TreeSet<String> geekTreeSet
                = new TreeSet<>();
        HashSet<String> geekHashSet
                = new HashSet<String>();

        // Add three object in
        // LinkedHashSet and TreeSet
        for (String str : Arrays.asList("Geek2",
                "Geek1",
                "Geek3",
                "Geek1")) {

            geekLinkSet.add(str);
            geekTreeSet.add(str);
            geekHashSet.add(str);
        }

        // should be sorted order HashSet
        // stores element in sorted order
        System.out.println("Insertion Order"
                + " of objects in HashSet :"
                + geekHashSet);

        // insertion order or elements LinkedHashSet
        // storeds elements as insertion
        System.out.println("Insertion Order of "
                + "objects in LinkedHashSet :"
                + geekLinkSet);

        // should be sorted order TreeSet
        // stores element in sorted order
        System.out.println("Insertion Order of"
                + " objects in TreeSet :"
                + geekTreeSet);

        System.out.println("===================================================");

        Set<String> set = new HashSet<>();
        set.add("1Z");
        set.add("2Y");
        set.add("3X");
        System.out.println(set); //[3X, 2Y, 1Z] (order disturbed)

        System.out.println("====================================================");

        Set<String> set1 = new LinkedHashSet<>();
        set1.add("1Z");
        set1.add("2Y");
        set1.add("3X");
        System.out.println(set1); //[1Z, 2Y, 3X]

        System.out.println("====================================================");

        Set<String> set2 = new TreeSet<>();
        set2.add("1Z");
        set2.add("2Y");
        set2.add("3X");
        System.out.println(set2);//[1Z, 2Y, 3X]

        System.out.println("=====================================================");

        Set<Integer> nums = new TreeSet<>();
        nums.add(20);
        nums.add(10);
        nums.add(30);
        nums.add(50);
        nums.add(40);
        nums.add(10);
        nums.add(20);

        System.out.println(nums);//[10, 20, 30, 40, 50]

        System.out.println("=====================================================");

        Set<Integer> nums1 = new LinkedHashSet<>();
        nums1.add(20);
        nums1.add(10);
        nums1.add(30);
        nums1.add(50);
        nums1.add(40);
        nums1.add(10);
        nums1.add(20);

        System.out.println(nums1); //[20, 10, 30, 50, 40]

        System.out.println("======================================================");

        Set<Integer> nums2 = new HashSet<>();
        nums2.add(20);
        nums2.add(10);
        nums2.add(30);
        nums2.add(50);
        nums2.add(40);
        nums2.add(10);
        nums2.add(20);

        System.out.println(nums2);//[50, 20, 40, 10, 30]







    }




}

