package Abstraction.Sport;

public class SportInterface {
    public static void main(String[] args) {
        Sport s = new Football();
        s.play();//playing football
        Sport s1 = new Badminton();
        s1.play();//playing badminton
    }
}
