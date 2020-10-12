package Inheritance.Practice2;

public class TeslaObjects {
    public static void main(String[] args) {

        Model3 car1 = new Model3("Muhammed","Model 3",2020,39000,"Red","316 mil",true);

        car1.engine();
        car1.oilChange();
        car1.setVIN("5YJ3E1EAXHF000316");
        System.out.println("VIN number is: "+car1.getVIN());

        System.out.println(car1);

        System.out.println("Enjoy your new car Mr.Muhammed :)");

        System.out.println("====================NO RACISM====================================");

        ModelX car2 = new ModelX("Agit","Model X",2020,84990,"White",7,"351 mil");

        car2.charge();
        car2.oilChange();
        car2.setVIN("5YJ3E1EAXHF000234");

        System.out.println("VIN number is: "+car2.getVIN());
        System.out.println(car2);

        System.out.println("Thank you for your business!");
        System.out.println("       Elon Musk    ");

    }
}
