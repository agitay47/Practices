package Polymorphism.Animal;
/*
  3. create subclass of Animal named Dog
            variable: dogName
            methods: bark
 */

public class Dog extends Animal{
    public String dogName;

    public Dog(String dogName, int age, String gender){
        this.dogName=dogName;
        this.age=age;
        this.gender=gender;
    }

    @Override
    public void eat() {
        System.out.println("Dog "+ dogName+ " is eating");
    }

    @Override
    public void sleeping() {

        System.out.println("Dog "+ dogName+ " is sleeping");
    }

    public void bark(){
        System.out.println("Dog "+ dogName+ " is barking");
    }
    public static void methodA(int a){
        System.out.println("Dog Class A");
    }

}
