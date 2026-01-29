
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter a number:");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter a number:");
        int num2 = scanner.nextInt();

        int result = num1-num2;
        
        System.out.println(num1 + " - " + num2 + " = " + result);
 

    }
}