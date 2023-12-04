import java.util.Stack;
import java.util.Scanner;

public class Uas9  {
    // Metode untuk memeriksa urutan kurung
    public static boolean periksaUrutanKurung(String ekspresi) {
        Stack<Character> stack = new Stack<>();

        // Iterasi melalui setiap karakter dalam ekspresi
        for (char karakter : ekspresi.toCharArray()) {
            if (karakter == '(' || karakter == '[' || karakter == '{') {
                // Jika kurung buka, push ke stack
                stack.push(karakter);
            } else if (karakter == ')' || karakter == ']' || karakter == '}') {
                // Jika kurung tutup, periksa dengan kurung buka terakhir
                if (stack.isEmpty()) {
                    return false; // Kurung tutup tanpa kurung buka yang sesuai
                }
                char kurungBukaTerakhir = stack.pop();
                if (!cocok(kurungBukaTerakhir, karakter)) {
                    return false; // Kurung tutup tidak sesuai dengan kurung buka
                }
            }
        }

        // Jika stack masih tidak kosong, berarti ada kurung buka yang belum ditutup
        return stack.isEmpty();
    }

    // Metode untuk memeriksa apakah kurung buka dan kurung tutup sesuai
    private static boolean cocok(char kurungBuka, char kurungTutup) {
        return (kurungBuka == '(' && kurungTutup == ')') ||
               (kurungBuka == '[' && kurungTutup == ']') ||
               (kurungBuka == '{' && kurungTutup == '}');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca ekspresi matematika dari pengguna
        System.out.print("Masukkan ekspresi matematika: ");
        String ekspresi = scanner.nextLine();

        // Memeriksa urutan kurung
        if (periksaUrutanKurung(ekspresi)) {
            System.out.println("Urutan kurung benar.");
        } else {
            System.out.println("Urutan kurung salah.");
        }

        scanner.close();
    }
}
