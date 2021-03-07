package bt.session4;

public class testCar {
    public static void main(String[] args) {
        Car c1 = new Car(6789);
        System.out.println(c1.move());
        System.out.println(c1.park());
        System.out.println(c1.accelerate());
    }
}
