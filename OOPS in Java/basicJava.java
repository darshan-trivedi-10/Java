class Pen {
    String color;
    String type; // ballpoint, gel

    public void write() {
        System.out.println(color + " " + type);
    }

    public void changeColor(String color) {
        this.color = color;
    }

}

class Student {
    private String name;
    int age;

    public void printInfo() {
        System.out.println(name + " " + age);
    }

    public void setName(String str) {
        name = str;

    }

}

// I am at 13:00 Time

public class basicJava {
    public static void main(String[] args) {

        /*
         * ---> Pen Class
         * Pen p = new Pen();
         * p.color = "RED";
         * p.type = "GEL";
         * p.write();
         * p.changeColor("Blue");
         * p.write();
         * 
         * Pen p1 = new Pen();
         * p1.write();
         * 
         */

        Student s = new Student();
        s.setName("Darshan");
        s.age = 18;
        s.printInfo();
        int arr[] = new int[10];
        arr[0] = 1;
    }
}