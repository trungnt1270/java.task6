package bt.session4;

public class Car {
    private int plateNumber;
    private int xLocation;
    private int yLocation;
    private int speed;

    public Car(){
        plateNumber = 9999;
        xLocation = 50;
        yLocation = 50;
        speed = 50;
    }

    public Car( int p){
        plateNumber = p;
        xLocation = 50;
        yLocation = 50;
        speed = 50;
    }

    public int move() {
        xLocation += speed;
        return xLocation;
    }

    public int park() {
        speed = 0;
        return xLocation;
    }

    public int accelerate(){
        speed += 5;
        return speed;
    }
}
