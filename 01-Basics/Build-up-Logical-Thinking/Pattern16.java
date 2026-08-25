public class Pattern16 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + i-1));
            }
            System.out.println();
        }
    }
}
