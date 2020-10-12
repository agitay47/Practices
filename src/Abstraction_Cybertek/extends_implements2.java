package Abstraction_Cybertek;

interface P {
    void method1();
}

interface Q {
    int method2();
}

abstract class R{
    abstract void method3();
}

public class extends_implements2 extends R implements Q , P{
    public static void main(String[] args) {
        //   R obj = new R(); not concrete
         // Q obj2 = new Q(); //Q is abstract, can not be instantiated

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    void method3() {

    }

    @Override
    public void method1() {

    }
}
