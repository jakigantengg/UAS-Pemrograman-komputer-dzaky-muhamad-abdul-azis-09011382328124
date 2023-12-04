import java.util.Scanner;

public class Uas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif: ");
        int number = scanner.nextInt();

        System.out.print("Faktorisasi " + number + ": ");
        factorize(number);
    }

    public static void factorize(int number) {
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }
    }
}
