import java.util.Scanner; 

public class dhiasedang3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean continueQuiz = true;

        while (continueQuiz) {

            System.out.print("Masukkan bilangan pertama: ");
            int bilanganPertama = scanner.nextInt();

           
            System.out.print("Masukkan bilangan kedua: ");
            int bilanganKedua = scanner.nextInt();

            System.out.print("Pilih operasi (1: kali, 2: bagi, 3: modulus): ");
            int operasi = scanner.nextInt();

            // Melakukan operasi berdasarkan pilihan pengguna`q
            switch (operasi) {
                case 1: // Perkalian
                    System.out.println(bilanganPertama + " * " + bilanganKedua + " = " + (bilanganPertama * bilanganKedua));
                    break;
                case 2: // Pembagian
                    if (bilanganKedua != 0) {
                        System.out.println(bilanganPertama + " / " + bilanganKedua + " = " + (bilanganPertama / bilanganKedua));
                    } else {
                        System.out.println("Pembagian dengan nol tidak diperbolehkan.");
                    }
                    break;
                case 3: // Modulus
                    if (bilanganKedua != 0) {
                        System.out.println(bilanganPertama + " % " + bilanganKedua + " = " + (bilanganPertama % bilanganKedua));
                    } else {
                        System.out.println("Modulus dengan nol tidak diperbolehkan.");
                    }
                    break;
                default:
                    System.out.println("Pilihan operasi tidak valid.");
                    break;
            }

            // Tanyakan kepada pengguna apakah ingin melanjutkan
            System.out.print("Apakah Anda ingin melanjutkan kuis? (ya/tidak): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("tidak")) {
                continueQuiz = false;
            }
        }

        System.out.println("Terima kasih telah mengikuti kuis!");
        scanner.close();
    }
}