public class Pattern12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {

            // Part 1: increasing
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Part 2: spaces
            for (int j = 1; j <= 2 * (4 - i); j++) {
                System.out.print(" ");
            }
            // Part 3: decreasing
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
