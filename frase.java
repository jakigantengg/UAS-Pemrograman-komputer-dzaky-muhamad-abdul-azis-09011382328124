import java.util.Scanner;

public class Uas6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata atau frase: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Kata atau frase tersebut adalah palindrom");
        } else {
            System.out.println("Kata atau frase tersebut bukan palindrom");
        }
    }

    public static boolean isPalindrome(String input) {
        String cleanedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int length = cleanedInput.length();

        for (int i = 0; i < length / 2; i++) {
            if (cleanedInput.charAt(i) != cleanedInput.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
