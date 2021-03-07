package bt.session4;

public class SoccerPlayer {
    private String name;
    private String msg = "Kick the Ball!";
    private int number;
    private int xLocation;
    private int yLocation;

    public SoccerPlayer(){
        name = "Player1";
        number = 1;
        xLocation = 50;
        yLocation = 50;
    }

    public SoccerPlayer(String n){
        name = n;
        number = 1;
        xLocation = 50;
        yLocation = 50;
    }

    public SoccerPlayer(String n, int num){
        name = n;
        number = num;
        xLocation = 50;
        yLocation = 50;
    }

    public int run() {
        this.xLocation += 50;
        return xLocation;
    }

    public int jump() {
        this.yLocation += 50;
        return yLocation;
    }

    public String kickBall(){
        return msg;
    }
    public String getName(){
        return name;
    }
}
