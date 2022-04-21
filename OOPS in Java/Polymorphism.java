class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(name + " " + age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameAge(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(10);
        s.printInfo();
        s.setName("Darshan");
        s.printInfo();
        s.setNameAge("Tushar", 18);
        s.printInfo();

        // Triange t = new Triange();
        // System.out.println(t.color);
        // t.color = "Red";
        // System.out.println(t.color);
    }
}
