package Abstraction_Cybertek;

abstract class A {
    public abstract void method1();//abstract class
    public void method2() { } //non abstract class

}


public class Abstract_VS_NonAbstract2 {
    // 2 methods
    public void method1(){

    }
}

abstract class B extends A{  // optional to override the abstract method of A
// one abstract & one instance methods

    // public abstract void method1();

}

class C extends B{

    public void method1(){

    }

}

