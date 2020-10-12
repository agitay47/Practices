package Udemy_Package.Polymorphism.Example4;

public class Main {
    public static void main(String[] args) {


        Hamburger hamburger = new Hamburger("Basic","Sausuge","White",3.56);
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato",0.27);
        hamburger.addHamburgerAddition2("Lettuce",0.75);
        hamburger.addHamburgerAddition3("Cheese",1.12);
        System.out.println("Total burger price is "+hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);
        healthyBurger.addHealthAddition1("Egg",5.43);
        healthyBurger.addHealthAddition1("Lentils",3.41);
        System.out.println("Total Healhty Burger price is "+healthyBurger.itemizeHamburger());

        DeluxBurger db = new DeluxBurger();
        db.itemizeHamburger();
        db.addHamburgerAddition1("should not do this",50.53);
    }
}
