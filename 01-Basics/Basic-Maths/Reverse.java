import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println("The reverse of the number is: " + reverse);
        sc.close();
    }

}

//now i add another solution of this problem for leetcode where it ask to return the value within a range of -2^31 to 2^31 - 1. If the reversed integer overflows, return 0.

/*
class Solution {
    public int reverse(int x) {

        int reverse = 0;
        while (x != 0) {
            int digit = x % 10;
            if (reverse > Integer.MAX_VALUE/10 || reverse == Integer.MAX_VALUE && digit > 7) {
                return 0;
            }
            if (reverse < Integer.MIN_VALUE / 10 ||
                    (reverse == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            reverse = reverse * 10 + digit;
            x /= 10;
        }
        return reverse;
    }
}
*/