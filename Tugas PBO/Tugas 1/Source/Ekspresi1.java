/* Pembagian Integer dan Casting */
public class Ekspresi1 {
    public static void main(String[] args) {
        /* KAMUS */
        int x = 1, y = 2;
        float fx, fy;

        /* ALGORITMA */
        System.out.println("x / y (format integer) = " + (x / y)); // Integer division
        System.out.println("x / y (format float) = " + ((float)x / y)); // Casting satu operand

        /* Supaya hasilnya tidak nol */
        fx = x;
        fy = y;
        System.out.println("fx / fy (format float) = " + (fx / fy)); // Operasi dengan float

        /* Casting */
        System.out.println("float(x) / float(y) (format float) = " + ((float)x / (float)y));

        /* Uji pembagian dengan nilai baru */
        x = 10;
        y = 3;
        System.out.println("x / y (format integer) = " + (x / y)); // Integer division
        System.out.println("x / y (format float) = " + ((float)x / y)); // Casting satu operand
    }
}
