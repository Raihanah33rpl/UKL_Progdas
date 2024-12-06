import java.util.Scanner;
import java.util.Random;

public class soalukl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Kuis Matematika Sederhana!");
        System.out.println("Ketik 'exit' untuk berhenti.");

        while (true) {
            // buat angka dan operator secara acak
            int num1 = random.nextInt(10) + 1; // 1-10
            int num2 = random.nextInt(10) + 1; // 1-10
            int operator = random.nextInt(3); 
            int correctAnswer = 0;
            String opSymbol = " ";

            if (operator == 0) { // Perkalian
                correctAnswer = num1 * num2;
                opSymbol = "*";
            } else if (operator == 1) { // Pembagian
                num1 = num1 * num2; // Pastikan pembagian bulat
                correctAnswer = num1 / num2;
                opSymbol = "/";
            } else { // Modulus
                correctAnswer = num1 % num2;
                opSymbol = "%"; // menghitung sisa pembagian
            }

            // tampilkan soal
            System.out.println("Berapa hasil dari: " + num1 + " " + opSymbol + " " + num2 + " ?");
            System.out.print("Jawaban Anda: ");
            String input = scanner.nextLine();

            // cek apkah user ingin keluar dr kuis
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Terima kasih telah bermain!");
                break;
            }
            // tolong jelaskan kepada saya
            try {
                int userAnswer = Integer.parseInt(input); 
                if (userAnswer == correctAnswer) {
                    System.out.println("Benar!");
                } else {
                    System.out.println("Salah. Jawaban yang benar adalah " + correctAnswer);
                }
            } catch (NumberFormatException e) {
                System.out.println("Masukkan angka yang valid atau 'exit' untuk keluar.");
            }

            System.out.println();
        }

        scanner.close(); 
    }
}
