import java.util.Scanner;

public class Dhiabismillah {
 
    public static void main(String[] args) {     
        Scanner input = new Scanner (System.in);

        System.out.println("masukan angka yang diinginkan");
        int bilangan = input.nextInt(); //membaca bilangan yg dimasukan olh pngguna

        if(bilangan % 2 == 0) { //apakah angk yg kt input jka dbagi 2 adlh 0 jk iya maka genap
            System.out.println(bilangan +" adalah bilangan genap");
        }else {
            System.out.println(bilangan +" adalah bilangan ganjil");
        }
    }
}