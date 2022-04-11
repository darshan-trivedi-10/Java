import java.net.SocketTimeoutException;
import java.util.Scanner;

public class condition {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>18)
        {
            System.out.println("You are Elegible");
        }else{
            System.out.println("You are Not Elegible");
        }

        // switch (key) {
        //     case value:
        //         break;
        //     default:
        //         break;
        // }
    }
}
