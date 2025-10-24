package modul_3;
public class MethodDasar {
    // Sebelum Dimodifikasi
    // Langkah 1: Method void tanpa parameter
    public static void tampilkanHeader() {
        System.out.println("================================");
        System.out.println(" PROGRAM KALKULATOR SEDERHANA");
        System.out.println("================================");
    }
    
    // Langkah 2: Method void dengan parameter
    public static void tampilkanHasil(String operasi, double a, double b, double hasil) {
        System.out.printf("%.2f %s %.2f = %.2f%n", a, operasi, b, hasil);
    }
    
    // Langkah 3: Method dengan return value
    public static double tambah(double a, double b) {
        return a + b;
    }
    
    public static double kurang(double a, double b) {
        return a - b;
    }
    
    public static double kali(double a, double b) {
        return a * b;
    }
    
    public static double bagi(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol!");
            return 0;
        }
    }
    
    // Langkah 4: Method dengan validasi input
    public static boolean validasiAngka(double angka) {
        return !Double.isNaN(angka) && Double.isFinite(angka);
    }
    
    public static void main(String[] args) {
        // Langkah 5: Menggunakan semua method
        tampilkanHeader();
        double x = 15.5;
        double y = 4.2;
        
        if (validasiAngka(x) && validasiAngka(y)) {
            double hasilTambah = tambah(x, y);
            double hasilKurang = kurang(x, y);
            double hasilKali = kali(x, y);
            double hasilBagi = bagi(x, y);
            
            tampilkanHasil("+", x, y, hasilTambah);
            tampilkanHasil("-", x, y, hasilKurang);
            tampilkanHasil("*", x, y, hasilKali);
            tampilkanHasil("/", x, y, hasilBagi);
        }

        // Setelah Dimodifikasi (Perubahan Nilai Input)
        // Langkah 5: Menggunakan semua method
        tampilkanHeader();
        double v = 10.5; // Nilai diubah
        double w = 1.2;  // Nilai diubah
        
        if (validasiAngka(v) && validasiAngka(w)) {
            double hasilTambah = tambah(v, w);
            double hasilKurang = kurang(v, w);
            double hasilKali = kali(v, w);
            double hasilBagi = bagi(v, w);
            
            tampilkanHasil("+", v, w, hasilTambah);
            tampilkanHasil("-", v, w, hasilKurang);
            tampilkanHasil("*", v, w, hasilKali);
            tampilkanHasil("/", v, y, hasilBagi);
        }
    }
}

