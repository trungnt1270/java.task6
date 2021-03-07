package bt.session4;

public class Student {
    private String name;
    private double gpa;

    public Student(){
        name = "Test";
        gpa = 4.0;
    }

    public Student(String n) {
        name = n;
        gpa = 4.0;
    }

    public Student(String n, double g) {
        name = n;
        gpa = g;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
    public double setGpa(double gpa) {
        this.gpa = gpa;
        return gpa;
    }
}
