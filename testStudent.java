package bt.session4;

public class testStudent {
    public static void main(String[] args){
        Student s1 = new Student("Paul Lee", 3.5);
        Student s2 = new Student("Peter Tan", 3.9);

        System.out.println(s1.getName());
        System.out.println(s1.getGpa());
        System.out.println("");
        System.out.println(s2.getName());
        System.out.println(s2.getGpa());
    }
}
