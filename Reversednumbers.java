import java.util.Scanner;
public class Reversednumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer;
        int stringlength ;
        System.out.println("Enter your number or string");
        answer = in.nextLine();
        stringlength = answer.length();

        for (int x = 1; x <= stringlength; x++) {
            System.out.print(answer.charAt(stringlength-x));
        }
        in.close();
        
        
        
        }
        
    }