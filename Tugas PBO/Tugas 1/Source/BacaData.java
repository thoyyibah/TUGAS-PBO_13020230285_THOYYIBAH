import java.util.Scanner;

/* Contoh membaca integer menggunakan Class Scanner */
public class BacaData {
    public static void main(String[] args) {
        /* Kamus */
        int a;
        Scanner masukan;

        /* Program */
        System.out.print("Contoh membaca dan menulis, ketik nilai integer: \n");

        masukan = new Scanner(System.in);
        a = masukan.nextInt(); // Coba ketik: masukan.nextInt(); Apa akibatnya?

        System.out.println("Nilai yang dibaca: " + a);
        
        masukan.close(); // Tambahkan untuk menutup Scanner
    }
}
