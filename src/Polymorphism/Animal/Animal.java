package Polymorphism.Animal;
/*
 1. create a class Animal
            variables: age, gender
            methods: eat, sleep
        DO NOT make them abstract we need this for today's example
 */

public abstract class Animal {

    public int age;
    public String gender;

    public void eat(){
        System.out.println("Animal is eating");
    }
    public void sleeping(){
        System.out.println("Animal is sleeping");
    }
    public static void methodA(){
        System.out.println("Animal Class");
    }
}
