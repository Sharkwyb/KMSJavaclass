public class methodtest {
    public static void main(String[]  args) {
        int x = 5, y = 10;
        System.out.println("Main. Before swap, x:" + x + "and y: " + y); swap (x,y);
        System.out.println("Main. After swap, x:" + x + "and y: " + y);
    }

    public static void swap(int x, int y) {
        int temp;
        System.out.println("Swap. Before swap, x: " + x + "and y: " + y); temp = x;
        x = y;
        y = temp;
        System.out.println("Swap. After swap, x: " + x + "and y: " + y);

    }
}