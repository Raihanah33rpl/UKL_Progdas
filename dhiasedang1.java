import java.util.Scanner;

public class dhiasedang1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("masukan sebuah bilangan bulat positif: ");
        int bilangan = input.nextInt();

        if (bilangan < 0) {  //untk ngecek apkah bilangan positif yg dimsukan
            System.out.println("bilangan harus positif!");
        }else  {
            long faktor = 1;  //menyimpan nilai i kdalam variable faktor 
            for (int i = 1; i <= bilangan; i++) {
                System.out.print(i + "*");
                faktor *= i;  ////faktor dihtung dngn cra * nilai variable faktor dngn nilai i dsetiap faktor 
            }
            System.out.println("1Faktor dari " + bilangan + " adalah: " + faktor);
            for (int i = 0; i <10; i++) {
                System.out.print(i);
            }
        }
    }
}