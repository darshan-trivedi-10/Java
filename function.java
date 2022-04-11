import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(average(a, b));

        int arr[] = new int[5];

        try {
            System.out.println(arr[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static int average(int a, int b) {
        return (a + b) / 2;
    }

}
