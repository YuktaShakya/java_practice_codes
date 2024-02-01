public class new3 {

    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            int star = 5 - row;
            int space = 2 * row - 3;
            for (int i = 1; i <= star; i++) {
                if (row == 1) {
                    System.out.print(5);
                } else if (row > 1 && i == 1 || i == star) {
                    System.out.print(5 - row);
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= star; k++) {
                if (row == 1) {
                    System.out.print(1);
                } else if (row > 1 && k == 1 || k == star) {
                    System.out.print(5 - row);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();}}
}