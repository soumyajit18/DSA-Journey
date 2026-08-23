public class Strings {
    public static void main(String[] args) {
        String text = "Hello, World!";

        System.out.println("Original: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("First Character: " + text.charAt(0));
        System.out.println("Substring: " + text.substring(0, 5));
    }
}