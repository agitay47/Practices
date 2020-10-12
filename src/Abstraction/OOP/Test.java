package Abstraction.OOP;

public class Test extends Shape{
    Test (){
        System.out.println("Test class constructor");
    }


    public static void main(String[] args) {
      //  Shape s = new Test();//dynamic polymorphism
       // s.drawing();
      //  s.fill();
        Test test = new Test();

    }

    @Override
    void drawing() {
        System.out.println("Test---drawing");
    }
}
