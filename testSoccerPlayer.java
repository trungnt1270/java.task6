package bt.session4;

public class testSoccerPlayer {
    public static void main(String[] args){
        SoccerPlayer p1 = new SoccerPlayer("Trung",10);
        System.out.println("Soccer Player name is: " + p1.getName());
        System.out.println(p1.run());
        System.out.println(p1.jump());
        System.out.println(p1.kickBall());
    }
}
