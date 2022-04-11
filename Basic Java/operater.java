import java.util.Scanner;

public class operater {
    public static void main(String[] args) {
        // + , -, /, *, %, ++, --
        int num1 = 10;
        int num2 = 20;

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        float total = sc.nextFloat();
        System.out.println(str);
        System.out.println(total * 2);
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num2 / num1);
    }
}
