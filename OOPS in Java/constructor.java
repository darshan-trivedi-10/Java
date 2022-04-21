class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(name + " " + age);
    }

    // Non Parameterize Constructor
    Student() {
        System.out.println("Constructor Called");
    }

    // Parameterize Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Student(Student temp) {
        name = temp.name;
        age = temp.age;
    }
}

public class constructor {
    public static void main(String[] args) {
        Student s = new Student();
        s.printInfo();

        Student s1 = new Student("Darshan", 18);
        s1.printInfo();

        Student s2 = new Student(s);
        s2.printInfo();
    }
}
