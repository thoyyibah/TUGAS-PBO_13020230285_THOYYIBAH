/* Operator Ternary */
public class Oper4 {
    public static void main(String[] args) {
        /* KAMUS */
        int i = 0;
        int j = 0;
        char c = 8, d = 10; // Bisa juga diganti dengan int jika tidak ingin pakai char
        int e = ((c > d) ? c : d);
        int k = ((i > j) ? i : j);

        /* ALGORITMA */
        System.out.println("Nilai e = " + e);
        System.out.println("Nilai k = " + k);

        i = 2;
        j = 3;
        k = ((i++ > j++) ? i : j);
        System.out.println("Nilai k setelah operasi = " + k);

        // Menampilkan nilai i dan j setelah operasi untuk lebih jelas
        System.out.println("Nilai i setelah operasi = " + i);
        System.out.println("Nilai j setelah operasi = " + j);
    }
}
