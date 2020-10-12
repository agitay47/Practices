package Udemy_Package.Polymorphism.Example3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8,"Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

//         mitsubishi = new Ford(6,"Outlander VRW 4WD");
//        System.out.println(mitsubishi.accelerate());
//        System.out.println(mitsubishi.brake());
//        System.out.println(mitsubishi.startEngine());

        Car ford = new Car(6, "Outlander VRW 4WD");

        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        System.out.println(ford.startEngine());
    }
}
