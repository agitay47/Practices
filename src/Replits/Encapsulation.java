package Replits;

public class Encapsulation {
    public static void main(String[] args) {

        Calc a = new Calc();
        a.setX(10);
        a.setY(20);
        a.plus(10,20);
        System.out.println(a.getResult());

    }
}
