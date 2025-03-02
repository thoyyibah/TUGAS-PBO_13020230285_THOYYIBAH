/* Contoh pengoperasian variabel bertipe dasar */
public class Oprator { // Perbaikan: Nama kelas harus sesuai dengan nama file
    public static void main(String[] args) {
        /* Kamus */
        boolean Bool1, Bool2, TF;
        int i, j, hsl;
        float x, y, res;

        /* Algoritma */
        System.out.println("Silahkan baca teksnya dan tambahkan perintah untuk menampilkan output");

        // Operasi boolean
        Bool1 = true;
        Bool2 = false;
        TF = Bool1 && Bool2;  // Boolean AND
        System.out.println("Bool1 AND Bool2: " + TF);
        
        TF = Bool1 || Bool2;  // Boolean OR
        System.out.println("Bool1 OR Bool2: " + TF);
        
        TF = !Bool1;          // Boolean NOT
        System.out.println("NOT Bool1: " + TF);
        
        TF = Bool1 ^ Bool2;   // Boolean XOR
        System.out.println("Bool1 XOR Bool2: " + TF);

        // Operasi numerik
        i = 5;
        j = 2;
        hsl = i + j;
        System.out.println("i + j: " + hsl);
        
        hsl = i - j;
        System.out.println("i - j: " + hsl);
        
        hsl = i * j;
        System.out.println("i * j: " + hsl);
        
        hsl = i / j; // Pembagian bulat
        System.out.println("i / j (pembagian bulat): " + hsl);
        
        hsl = i % j; // Modulo
        System.out.println("i % j: " + hsl);

        // Operasi numerik dengan float
        x = 5;
        y = 5;
        res = x + y;
        System.out.println("x + y: " + res);
        
        res = x - y;
        System.out.println("x - y: " + res);
        
        res = x * y;
        System.out.println("x * y: " + res);
        
        res = x / y;
        System.out.println("x / y: " + res);

        // Operasi relasional numerik
        System.out.println("i == j: " + (i == j));
        System.out.println("i != j: " + (i != j));
        System.out.println("i < j: " + (i < j));
        System.out.println("i > j: " + (i > j));
        System.out.println("i <= j: " + (i <= j));
        System.out.println("i >= j: " + (i >= j));

        // Operasi relasional numerik dengan float
        System.out.println("x != y: " + (x != y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x <= y: " + (x <= y));
        System.out.println("x >= y: " + (x >= y));
    }
}
