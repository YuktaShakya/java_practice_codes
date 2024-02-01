import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        printPattern(numRows);

        scanner.close();
    }

    static void printPattern(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            // Print increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print spaces
            for (int k = 2 * (numRows - i); k > 0; k--) {
                System.out.print(" ");
            }

            // Print decreasing numbers
            for (int l = i-1; l > 0; l--) {
                System.out.print(l);
            }

            System.out.println();
        }
}}