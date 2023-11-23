import java.util.Scanner;
public class spuare {

    public static int sum(int number1, int number2) {
        int sum, square1, square2;
        square1 = number1 * number1;
        square2 = number2 * number2; 
        sum = square1 + square2;
        return sum;
        

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = in.nextInt();
        System.out.println("Enter another number");
        int num2 = in.nextInt();
        int total;
        total = sum(num1, num2);
        System.out.println(total);
    }
  
    
}
