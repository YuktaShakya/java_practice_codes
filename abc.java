import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        printPattern(numRows);

        scanner.close();
    }

    static void printPattern(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            // Print decreasing numbers
            for (int j = numRows; j >= i; j--) {
                System.out.print(j);
            }

            // Print spaces
            for (int k = 2 * (i - 1); k > 0; k--) {
                System.out.print(" ");
            }

            // Print increasing numbers
            for (int l = i; l <= numRows; l++) {
                System.out.print(l);
            }

            System.out.println();
        }
    }
}