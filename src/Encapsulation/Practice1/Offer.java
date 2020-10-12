package Encapsulation.Practice1;

public class Offer {

    //Location,isFullTime, WFH, jobTitle, hasBenefit,  instance variables
    //companyName==>static
    //salary, bonus ==>private

    public String location;
    public String name;
    public boolean isFullTime;
    public boolean WFH;
    public String jobTitle;
    public boolean hasBenefit;
    private double salary;
    private double bonus;

    public static String companyName;

    public void setInfo(String location, String name, boolean isFullTime, boolean WFH, String jobTitle, boolean hasBenefit) {
        this.location = location;
        this.name = name;
        this.isFullTime = isFullTime;
        this.WFH = WFH;
        this.jobTitle = jobTitle;
        this.hasBenefit = hasBenefit;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void interview() {
        System.out.println(name + " will get offer after interview");
    }

    public String toString() {
        return "Name: " + name + "\nCompany Name: " + companyName + "\nCompany Location: " + location + "\nOffer is Full Time: " + isFullTime +
                "\nCan I work from home: " + WFH + "\nJob Title: " + jobTitle + "\nOffer has benefit: " + hasBenefit;
    }


}
