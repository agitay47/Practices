package Inheritance.Practice2;

public class Model3 extends Tesla{

    public String range;
    public boolean hasDualMotor;

    public Model3(String buyer,String model, int year, double price, String color,String range,boolean hasDualMotor){
        setInfo(buyer,model,year,price,color);
        this.range = range;
        this.hasDualMotor = hasDualMotor;
    }

    public void engine(){
        System.out.println(brand+" "+model+" has no engine");
    }

    public void oilChange(){
        System.out.println(brand+" "+model+" does not need oil");
    }
}
