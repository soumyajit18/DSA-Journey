public class Pattern15 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j <= 5 - i; j++) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }
}
