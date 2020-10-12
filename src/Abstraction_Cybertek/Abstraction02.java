package Abstraction_Cybertek;
interface A1{
    void method1(); // public
}

interface B1{
    abstract int method2(); // public
}

interface C1{
    public abstract void method3();
}


public class Abstraction02 implements A1 , B1 , C1{
    public void method1(){

    }

    public int method2(){
        return 10;
    }

    public void method3(){

    }

}
