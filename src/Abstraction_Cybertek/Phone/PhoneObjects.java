package Abstraction_Cybertek.Phone;

public class PhoneObjects {
    public static void main(String[] args) {

        iPhone iphone1 = new iPhone("XS", 999, "11 inches");
        iPhone iphone2 = new iPhone("8 Plus", 899, "10 inches");

        System.out.println(iphone1);
        System.out.println(iphone2);

        iphone1.faceTiming(123456); //iPhone is face-timing with 123456
        iphone1.calling(911); //911 is calling
        iphone1.texting(123456); //123456 is texting


        System.out.println("===============================");

        Samsung samsung1 = new Samsung("Note11", 1199, "Large");

        System.out.println(samsung1);

        samsung1.calling(12345676);

        samsung1.freezing();

        samsung1.texting(1234567); //Samsung is freezing  when using
    }
}
