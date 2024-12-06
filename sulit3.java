import java.util.HashMap;
import java.util.Scanner;

public class sulit3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array
        System.out.println("Masukkan elemen array (pisahkan dengan spasi):");
        String input = scanner.nextLine();

        // Pisahkan input menjadi elemen-elemen array
        String[] inputArray = input.split(" ");
        int[] array = new int[inputArray.length];

        // Konversi input ke array integer
        for (int i = 0; i < inputArray.length; i++) {
            array[i] = Integer.parseInt(inputArray[i]);
        }

        // Hitung frekuensi elemen
        HashMap<Integer, Integer> frekuensi = new HashMap<>();

        for (int num : array) {
            if (frekuensi.containsKey(num)) {
                frekuensi.put(num, frekuensi.get(num) + 1);
            } else {
                frekuensi.put(num, 1);
            }
        }

        // Tampilkan hasil
        System.out.println("Frekuensi setiap elemen dalam array:");
        for (int key : frekuensi.keySet()) {
            System.out.println(key + " muncul " + frekuensi.get(key) + " kali");
        }

        scanner.close();
    }
}




