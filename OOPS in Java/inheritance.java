import java.util.*;

class Shape {
    String color;

    public void area() {
        System.out.println("Displaying Area");
    }
}

class Triange extends Shape {
    public void area(int l, int h) {
        System.out.println(l / 2 * l * h);
    }
}

class EquilateralTriange extends Triange {
    public void area(int l, int h) {
        System.out.println(l / 2 * l * h);
    }
}

public class inheritance {
    public static void main(String[] args) {
        EquilateralTriange a = new EquilateralTriange();
        a.area();
        a.area(5, 10);
    }
}
