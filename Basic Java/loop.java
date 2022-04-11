import java.util.Scanner;

import javax.xml.transform.Source;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("I am For Loop");
        }

        n = sc.nextInt();
        while (n-- > 0) {
            System.out.println("I am while Loop");
        }
        do {
            System.out.println("I am do-while Loop");
        } while (n > 0);
    }
}
