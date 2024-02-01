public class T {
    public static void main(String[] args) {
        int rows = 5; // Adjust the number of rows as needed

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("1");
                if (j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}