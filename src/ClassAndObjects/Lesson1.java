package ClassAndObjects;

public class Lesson1 {
    public static void main(String[] args) {
       int var1=5;
       double var2= 3.65;

       aircraft cessna172 = new aircraft();     //creates object of class aircraft

       //aircraft piperSaratoga = new aircraft();




    }
}
//class a tamplete
class aircraft {
    int passengers;               //number of people
    int cruiseSpeed;             // miles per hour
    double fuelCapacity;        //gallons
    double fuelBurnRate;       //gallons per hour

}
