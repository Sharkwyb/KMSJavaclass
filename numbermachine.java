import java.util.Scanner;
public class numbermachine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double number;
        System.out.println("Please enter a number");
        number = in.nextDouble();
        if (number == 0)
            System.out.println("zero");
        if (number > 0)
            if (number < 1000000)
                System.out.println("Small positive number");
            else 
                System.out.println("Large positive number");
        if (number < 0)
            if (number <= -1000000)
                System.out.println("Large negative number");
            else 
                System.out.println("Small negative number");

    }
}
