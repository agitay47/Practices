package Encapsulation.Practice1;

public class Tesla extends Offer {
    public boolean freeTesla;
    public boolean freeSolarSystem;
    public boolean offerShare;

    static {
        companyName = "TESLA";
    }

    public Tesla(String location, String name, boolean isFullTime, boolean WFH, String jobTitle, boolean hasBenefit, boolean freeTesla, boolean freeSolarSystem, boolean offerShare) {
        this.freeTesla = freeTesla;
        this.freeSolarSystem = freeSolarSystem;
        this.offerShare = offerShare;
    }

    public void career() {
        System.out.println("Tesla offer you a good career: " + hasBenefit);
    }


}
