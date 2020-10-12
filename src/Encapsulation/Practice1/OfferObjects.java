package Encapsulation.Practice1;

public class OfferObjects {
    public static void main(String[] args) {

        Nasa offer1 = new Nasa("D.C", "Vesile", true, true, "Testing Lead",
                true, 21, true);

        offer1.setBonus(10000);
        offer1.setSalary(120000);

        offer1.space();
        offer1.solarSystem();

        System.out.println("Yearly Bonus: " + offer1.getBonus());
        System.out.println("Salary: " + offer1.getSalary());
        System.out.println(offer1);


        System.out.println("=========NO RACISM===========================");

        Tesla offer2 = new Tesla("California", "Muhammed", true, true, "Developer",
                true, false, false, true);

        offer2.career();
        offer2.interview();
        offer2.name = "Muhammed CAKMAK";
        offer2.location = "California";
        offer2.jobTitle = "Developer";

        offer2.setBonus(20000);
        offer2.setSalary(130000);

        System.out.println("Yearly Bonus: " + offer2.getBonus());
        System.out.println("Salary: " + offer2.getSalary());
        System.out.println(offer2);


    }
}
