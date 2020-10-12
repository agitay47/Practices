package Group10;

public class Sport {

    String name;
    int numOfPlayers;
    boolean teamBased;

    public void makeSport(String name, int numOfPlayers,boolean teams){
        name = name;
        numOfPlayers = numOfPlayers;
        teamBased = teamBased;
    }

    public String toString(){
        String msg = "The supoort is "+ name+" and has "+numOfPlayers+ " player total";
        if(teamBased){
            msg +="divided into teams";
        }else{
            msg +="but there is  no teams";
        }
        return msg;
    }

    public static void main(String[] args) {
        Sport soccer = new Sport();
        soccer.makeSport("Soccer",22, true);
        System.out.println(soccer);
    }
}
