import java.util.Scanner;
public class JerryBerry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number:");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("JerryBerry");
        else if (number % 5 == 0)
            System.out.println("Jerry");
        else if (number % 3 == 0)
            System.out.println("Berry");
        else
            System.out.println(number);
    }
}
