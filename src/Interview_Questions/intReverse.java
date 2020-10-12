package Interview_Questions;

public class intReverse {
    public static void main(String[] args) {

        int x=12345;
        String s=""+x;
        String reverse="";
        for (int i = s.length()-1; i >=0 ; i--) {
            reverse+=s.charAt(i);
        }
        System.out.println(Integer.parseInt(reverse));

    }
}
