package Replits;
/* */

public class TV {
    int channel=1;
    int volumeLevel=1;
    boolean on = false;
    String brand = "undefined";

    public TV(){
        System.out.println("Creating TV object using no Args- constructor");
    }

    public TV(String brand){
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public void setVolumeLevel(int volumeLevel){
        if(1 <= volumeLevel && volumeLevel <= 7 && on){
            this.volumeLevel = volumeLevel;
        }else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }

    }

    public void setChannel(int channel){
        if(channel < 0 || channel > 120 || !on){
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }else{
            this.channel = channel;
        }
    }

    public void setBrand(String brand){
        this.brand = brand;
    }


    public int getVolumeLevel(){
        return volumeLevel;
    }

    public int getChannel(){
        return channel;
    }

    public String getBrand(){
        return brand;
    }

    public void channelUp(){
        channel++;
    }

    public void channelDown(){
        channel--;
    }


    public void volumeUp(){
        volumeLevel++;
    }

    public void volumeDown(){
        volumeLevel--;
    }

    public boolean isOn(){
        return on;
    }

    public void turnOn(){
        if(on){
            System.out.println("TV is already ON");
        }else {
            on = true;
        }
    }

    public void turnOff(){
        if(!on){
            System.out.println("TV is already OFF");
        }else {
            on = false;
        }
    }

}
