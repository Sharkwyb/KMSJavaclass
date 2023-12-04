import java.util.Scanner;
public class Sortcomputerterms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String terms[] = new String[10];
        System.out.println("Please enter 10 computer terms");
        for (int i = 0; i < 10; i++) {
            terms[i] = in.nextLine();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(terms[i] + " ");
        }
        Sort(terms);
        for (int i = 0; i < 10; i++) {
            System.out.print(terms[i] + " ");
        }
       



        }
        public static void Sort(String terms[]) {
            String temp = new String();
            for (int i = 0; i < 10; i++) {
                if (terms[i].compareTo(terms[i+1]) < 0) {
                terms[i] = temp;
                terms[i] = terms[i+1];
                terms[i+1] = temp;
                
            }

        }
        }

}
