import java.util.Scanner;
public class weekdays {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int number;
    System.out.println("What is your number, between 1-7?");
    number = in.nextInt();
    switch (number) {
        case 1:
            System.out.println("Sunday");
            break;
        case 2:
            System.out.println("Monday");
            break;
        case 3:
            System.out.println("Tuesday");
            break;
        case 4:
            System.out.println("Wednesday");
            break;
        case 5:
            System.out.println("Thursday");
            break;
        case 6:
            System.out.println("Friday");
            break;
        case 7:
            System.out.println("Sunday");
            break;    
      
        default:
        System.out.println("That is not a number between 1 to 7");
        break;
    }
  }
}
