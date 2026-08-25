public class Pattern18 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int j = n - i - 1; j < n; j++) {
                System.out.print((char) ('A' + j) + " ");
            }

            System.out.println();
        }
    }
}
