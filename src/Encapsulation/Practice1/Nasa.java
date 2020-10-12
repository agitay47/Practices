package Encapsulation.Practice1;

public class Nasa extends Offer {

    public int vacationDays;
    public boolean getShare;

    static {
        companyName = "NASA";
    }

    public Nasa(String location, String name, boolean isFullTime, boolean WFH, String jobTitle, boolean hasBenefit, int vacationDays, boolean getShare) {
        setInfo(location, name, isFullTime, WFH, jobTitle, hasBenefit);
        this.vacationDays = vacationDays;
        this.getShare = getShare;
    }

    public void space() {
        System.out.println(name + " might go to Mars");
    }

    public void solarSystem() {
        System.out.println(name + " will get solar system");
    }


}
