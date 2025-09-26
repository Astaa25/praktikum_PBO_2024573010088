package modul_2;

public class VariabelDemo {
    public static void main(String[] args) {
        // Deklarasi dan Inisialisasi Variabel
        int umur = 19 ;
        double tinggi = 175.5;
        char grade = 'A';
        boolean lulus = true;
        String nama = "Abrar Astafaraiz";

        // Menampilkan Nilai Variabel
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur + " Tahun");
        System.out.println("Tinggi : " + tinggi + " cm");
        System.out.println("Grade : " + grade);
        System.out.println("Lulus : " + lulus);

        int a = 10;
        int b = 3;

        System.out.println("\n=== Operasi Aritmatika ===");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\n=== Casting Tiap Data ===");
        double nilaiDouble = 9.8;
        int nilaiInt = (int) nilaiDouble;

        System.out.println("Nilai Double : " + nilaiDouble);
        System.out.println("Setelah casting ke int : " + nilaiInt);

        // Automatic Promotion
        byte byteVar = 50;
        short shortVar = 100;
        int hasil = byteVar + shortVar;
        System.out.println("Byte + Short = " + hasil + " (tipe : int)");
    }
}
