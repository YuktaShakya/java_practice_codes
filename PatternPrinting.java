public class PatternPrinting{
    public static void main(String[] args) {
        printPattern(1, 543212345);
    }

    private static void printPattern(int currentRow, int maxRows) {
        if (currentRow > maxRows) {
            return;
        }

        printRow(currentRow);
        printPattern(currentRow + 1, maxRows);
    }

    private static void printRow(int currentRow) {
        String space = " ";
        String row = "";

        for (int i = 1; i <= currentRow; i++) {
            row += space + i;
        }

        row += " " + currentRow;

        for (int i = currentRow - 1; i >= 1; i--) {
            row += space + i;
        }

        System.out.println(row);
    }
}