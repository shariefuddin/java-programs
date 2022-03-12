import java.util.Scanner;

class factors {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, i = 1;

        System.out.println("-----Enter number-----");
        x = in.nextInt();

        System.out.print("\nThe factors of the " + x + " are: ");
        while (i <= x) {
            if (x % i == 0) {
                System.out.print(i + " ");
            }
            ++i;
        }
        System.out.print("\n");
    }
}