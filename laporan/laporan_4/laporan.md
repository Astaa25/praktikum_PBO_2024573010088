# Laporan Modul 4: Pengenalan Object Oriented Programming
**Mata Kuliah:** Praktikum Pemrograman Berorientasi Objek   
**Nama:** Abrar Astafaraiz  
**NIM:** 2024573010088  
**Kelas:** TI 2A

---

# BAB I - PENDAHULUAN

&emsp;&emsp;Modul ini dirancang untuk memberikan pemahaman dasar tentang pemrograman berorientasi objek menggunakan Java melalui praktikum langsung. Setiap praktikum dilengkapi dengan teori dasar dan langkah-langkah implementasi yang detail.

## 1.1 Teori Dasar
&emsp;&emsp;Objek-Oriented Programming (OOP) adalah paradigma pemrograman yang menggunakan “objek” - struktur data yang berisi data, dalam bentuk field, sering kali dikenal sebagai atribut; dan kode, dalam bentuk prosedur, sering kali dikenal sebagai metode.

&emsp;&emsp;Inti dari OOP adalah mendesain software dengan membagi masalah menjadi serangkaian objek yang saling berinteraksi. Ini bertentangan dengan pemrograman prosedural, yang fokus pada fungsi/prosedur dalam memproses data. OOP memungkinkan kita untuk membuat kode yang lebih modular, reusable, dan mudah di-maintain.

### 1.1.1 Konsep Dasar OOP:
`Class`: Template atau blueprint untuk membuat object  
`Object`: Instance dari sebuah class  
`Attribute/Field`: Variabel yang dimiliki oleh class  
`Method`: Function yang dimiliki oleh class  
`Constructor`: Method khusus untuk inisialisasi object  

### 1.1.2 Prinsip OOP:
Encapsulation: Menyembunyikan detail implementasi  
Inheritance: Pewarisan sifat dari class parent  
Polymorphism: Kemampuan object untuk memiliki banyak bentuk  
Abstraction: Menyederhanakan kompleksitas dengan menyembunyikan detail  

## 1.2 Class dan Objek

&emsp;&emsp;kelas adalah konsep abstrak yang mendefinisikan set atribut dan metode yang akan dimiliki oleh object. Kelas menyediakan struktur atau template yang menentukan bagaimana sebuah object harus dibuat. Kelas akan menentukan jenis atribut dan metode apa yang akan dimiliki oleh object, tetapi tidak menentukan nilai dari atribut itu sendiri untuk object tertentu.

&emsp;&emsp;Object adalah inti dari pemrograman berorientasi objek. Setiap object memiliki dua karakteristik utama, yaitu:

&emsp;&emsp;Object, dalam konteks pemrograman OOP, adalah sebuah entitas yang memiliki karakteristik dan perilaku. Kelas, di sisi lain, merupakan blueprint atau cetakan untuk membuat object. Kalau kamu bandingkan dengan dunia nyata, kamu bisa menganggap kelas sebagai rencana desain bangunan, sedangkan object adalah bangunan yang sesungguhnya telah dibangun berdasarkan desain tersebut.

# BAB II - PRAKTIKUM
## 2.1 Praktikum : Dasar Class dan Object
### 2.1.1 Tujuan

&emsp;&emsp;Memahami cara membuat class, object, dan menggunakan constructor, dan relasi class

### 2.1.2 Langkah-langkah
1. Buat class baru bernama Mahasiswa
2. Buat class Mahasiswa dan isikan kode berikut:
```declarative
package modul_4;

public class Mahasiswa {
    // Atribut Field (private untuk encapsulation
    private final String nama;
    private final String nim;
    private final String jurusan;

    // Construktor dengan parameter
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // Getter Methods
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }
}

```

3. Buat class Matakuliah dan isikan kode berikut:
```declarative
package modul_4;

public class MataKuliah {
    private String kode;
    private String nama;
    private int sks;
    private double nilai;

    //constructor
    public MataKuliah(String kode,String nama,int sks){
        this.kode=kode;
        this.nama=nama;
        this.sks=sks;
        this.nilai=0.0;
    }

    //Getter dan setter
    public String getKode(){
        return kode;
    }
    public String getNama(){
        return nama;
    }
    public int getsks(){
        return sks;
    }
    public double getNilai(){
        return nilai;
    }

    public void setnilai(double nilai){
        if(nilai >= 0.0 && nilai <= 100.0){
            this.nilai=nilai;
        }else {
            System.out.println("nilai harus antara 0-100");
        }
    }

    //konversi nilai angka ke huruf
    public  String getNilaiHuruf(){
        if(nilai >= 85)return "A";
        else if(nilai >= 80)return "A-";
        else if(nilai >= 75)return "B+";
        else if(nilai >= 70)return "B";
        else if(nilai >= 65)return "B-";
        else if(nilai >= 60)return "C+";
        else if(nilai >= 55)return "C";
        else if(nilai >= 50)return "D";
        else return "E";
    }
    //konversi nilai ke bobot
    public double getBobotNilai(){
        String huruf=getNilaiHuruf();
        switch (huruf){
            case "A":return 4.0;
            case "A-":return 3.7;
            case "B+":return 3.3;
            case "B":return 3.0;
            case "B-":return 2.7;
            case "C+":return 2.3;
            case "C":return 2.0;
            case "D":return 1.0;
            default:return 0.0;
        }
    }
    public void tampilkanInfo(){
        System.out.printf("%-10s %-30s %d SKS | Nilai:%.2f (%s)\n",kode,nama,sks,nilai,getNilaiHuruf());
    }
}
```

4. Buat class KartuRencanaStudi dan isikan kode berikut:
```declarative
package modul_4;

public class KartuRencanaStudi {
    private Mahasiswa mahasiswa;
    private MataKuliah[] daftarMatakuliah;
    private int jumlahMatkul;
    private int maxMatkul;

    // Konstruktor
    public KartuRencanaStudi(Mahasiswa mahasiswa, int maxMatkul) {
        this.mahasiswa = mahasiswa;
        this.maxMatkul = maxMatkul;
        this.daftarMatakuliah = new MataKuliah[maxMatkul];
        this.jumlahMatkul = 0;
    }

    // Menambah mata kuliah ke KRS
    public boolean tambahMatakuliah(MataKuliah matkul) {
        if (jumlahMatkul < maxMatkul) {
            daftarMatakuliah[jumlahMatkul] = matkul;
            jumlahMatkul++;
            System.out.println("\nNote: Mata kuliah " + matkul.getNama() + " berhasil ditambahkan.");

            return true;
        } else {
            System.out.println("\nNote: KRS sudah penuh! Maksimal " + maxMatkul + " mata kuliah.");
            return false;
        }
    }

    // Menghitung total SKS
    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            totalSKS += daftarMatakuliah[i].getsks();
        }
        return totalSKS;
    }

    // Menghitung IPK
    public double hitungIPK() {
        if (jumlahMatkul == 0) return 0.0;

        double totalBobot = 0.0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMatkul; i++) {
            MataKuliah mk = daftarMatakuliah[i];
            totalBobot += mk.getBobotNilai() * mk.getsks();
            totalSKS += mk.getsks();
        }

        return totalSKS > 0 ? totalBobot / totalSKS : 0.0;
    }

    // Menampilkan KRS
    public void tampilkanKRS() {
        System.out.println("----------------------------------------------------------");
        System.out.println("\t\tKARTU RENCANA STUDI (KRS)");
        System.out.println("----------------------------------------------------------");
        System.out.println("Nama Mahasiswa : " + mahasiswa.getNama());
        System.out.println("NPM            : " + mahasiswa.getNim());
        System.out.println("Jurusan        : " + mahasiswa.getJurusan());
        System.out.println("----------------------------------------------------------");
        System.out.println("KODE\tMATA KULIAH\t\tSKS\tNILAI");
        System.out.println("----------------------------------------------------------");

        if (jumlahMatkul == 0) {
            System.out.println("Belum ada mata kuliah yang diambil.");
        } else {
            for (int i = 0; i < jumlahMatkul; i++) {
                daftarMatakuliah[i].tampilkanInfo();
            }
        }

        System.out.println("----------------------------------------------------------");
        System.out.println("Total SKS   : " + hitungTotalSKS());
        System.out.printf("IPK Semester: %.2f\n", hitungIPK());
        System.out.println("----------------------------------------------------------\n");
    }

    // Mencari mata kuliah berdasarkan kode
    public MataKuliah cariMatakuliah(String kode) {
        for (int i = 0; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getKode().equalsIgnoreCase(kode)) {
                return daftarMatakuliah[i];
            }
        }
        return null;
    }

    // Getter tambahan jika diperlukan
    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public int getJumlahMatkul() {
        return jumlahMatkul;
    }

    public int getMaxMatkul() {
        return maxMatkul;
    }
}
```

5. Buat class Main untuk menguji:
```declarative
package modul_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("------------------------------------------------");
        System.out.println("           SISTEM KARTU RENCANA STUDI (KRS)     ");
        System.out.println("------------------------------------------------");

        // Input data mahasiswa
        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("NIM: ");
        String nim = input.nextLine();

        System.out.print("Jurusan: ");
        String jurusan = input.nextLine();

        // Membuat object mahasiswa
        Mahasiswa mhs = new Mahasiswa(nama, nim, jurusan, 0.0);

        // Membuat object KRS (maksimal 10 mata kuliah)
        KartuRencanaStudi krs = new KartuRencanaStudi(mhs, 10);

        // Menu KRS
        boolean running = true;

        while (running) {
            System.out.println("------------------------------------------------");
            System.out.println("|                  MENU KRS                    |");
            System.out.println("------------------------------------------------");
            System.out.println("| 1. Tambah Mata Kuliah                        |");
            System.out.println("| 2. Input Nilai Mata Kuliah                   |");
            System.out.println("| 3. Tampilkan KRS                             |");
            System.out.println("| 4. Keluar                                    |");
            System.out.println("------------------------------------------------");
            System.out.print("Pilih menu: ");

            int pilihan = input.nextInt();
            input.nextLine(); // consume newline

            switch (pilihan) {
                case 1:
                    // Tambah mata kuliah
                    System.out.println("\nTAMBAH MATA KULIAH");
                    System.out.println("--------------------");
                    System.out.print("Kode Mata Kuliah: ");
                    String kode = input.nextLine();
    
                    System.out.print("Nama Mata Kuliah: ");
                    String namaMK = input.nextLine();
    
                    System.out.print("Jumlah SKS: ");
                    int sks = input.nextInt();
                    input.nextLine();
                    
                    MataKuliah mk = new MataKuliah(kode, namaMK, sks);
                    krs.tambahMatakuliah(mk);
                    break;

                case 2:
                    // Input nilai
                    System.out.println("\nINPUT NILAI");
                    System.out.println("\n--------------------");
                    System.out.print("Kode Mata Kuliah : ");
                    String kodeCari = input.nextLine();
                    
                    MataKuliah mkCari = krs.cariMatakuliah(kodeCari);
                    if (mkCari != null) {
                        System.out.print("Nilai (1 - 100) : ");
                        double nilai = input.nextDouble();
                        mkCari.setnilai(nilai);
                        System.out.println("Nilai berhasil diinput!");
                    } else {
                        System.out.println("Mata Kuliah tidak ditemukan!");
                    }
                    break;
                
                case 3:
                    // Tampilkan KRS
                    krs.tampilkanKRS();
                    break;
                
                case 4:
                    // Keluar dari program
                    running = false;
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }
}
```

4. Jalankan program, kemudian lakukan ujicoba dengan berbagai input.
5. Amati bagaimana object menyimpan data, juga bagaimana method bekerja.

### 2.1.3 Tugas Praktikum

Modifikasi kode diatas sesuai dengan instruksi berikut:
* Tambahkan fitur untuk menghapus mata kuliah dari KRS
* Buat validasi agar total SKS tidak melebihi batas tertentu (misalnya 24 SKS)
* Tambahkan method untuk menampilkan mata kuliah dengan nilai terbaik dan terburuk

### 2.1.4 Hasil Tugas Praktikum

TugasKartuRencanaStudi :
```declarative
package modul_4;

public class TugasKartuRencanaStudi {
    private Mahasiswa mahasiswa;
    private MataKuliah[] daftarMatakuliah;
    private int jumlahMatkul;
    private int maxMatkul;
    private final int BATAS_SKS = 24; // batas maksimum total SKS

    // Konstruktor
    public TugasKartuRencanaStudi(Mahasiswa mahasiswa, int maxMatkul) {
        this.mahasiswa = mahasiswa;
        this.maxMatkul = maxMatkul;
        this.daftarMatakuliah = new MataKuliah[maxMatkul];
        this.jumlahMatkul = 0;
    }

    // Menambah mata kuliah ke KRS dengan validasi batas SKS
    public boolean tambahMatakuliah(MataKuliah matkul) {
        int totalSKSSementara = hitungTotalSKS() + matkul.getsks();

        if (totalSKSSementara > BATAS_SKS) {
            System.out.println("\nTidak dapat menambahkan " + matkul.getNama() +
                    " karena total SKS akan melebihi batas " + BATAS_SKS + " SKS!");
            return false;
        }

        if (jumlahMatkul < maxMatkul) {
            daftarMatakuliah[jumlahMatkul] = matkul;
            jumlahMatkul++;
            System.out.println("\nMata kuliah " + matkul.getNama() + " berhasil ditambahkan!");
            return true;
        } else {
            System.out.println("\nKRS sudah penuh! Maksimal " + maxMatkul + " mata kuliah.");
            return false;
        }
    }

    // Menghapus mata kuliah berdasarkan kode
    public boolean hapusMatakuliah(String kode) {
        for (int i = 0; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getKode().equalsIgnoreCase(kode)) {
                System.out.println("\nMata kuliah " + daftarMatakuliah[i].getNama() + " berhasil dihapus dari KRS!");
                // Geser elemen setelahnya ke kiri
                for (int j = i; j < jumlahMatkul - 1; j++) {
                    daftarMatakuliah[j] = daftarMatakuliah[j + 1];
                }
                daftarMatakuliah[jumlahMatkul - 1] = null;
                jumlahMatkul--;
                return true;
            }
        }
        System.out.println("\nMata kuliah dengan kode " + kode + " tidak ditemukan!");
        return false;
    }

    // Menghitung total SKS
    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            totalSKS += daftarMatakuliah[i].getsks();
        }
        return totalSKS;
    }

    // Menghitung IPK
    public double hitungIPK() {
        if (jumlahMatkul == 0) return 0.0;

        double totalBobot = 0.0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMatkul; i++) {
            MataKuliah mk = daftarMatakuliah[i];
            totalBobot += mk.getBobotNilai() * mk.getsks();
            totalSKS += mk.getsks();
        }

        return totalSKS > 0 ? totalBobot / totalSKS : 0.0;
    }

    // Menampilkan mata kuliah dengan nilai terbaik
    public void tampilkanMatkulTerbaik() {
        if (jumlahMatkul == 0) {
            System.out.println("Belum ada mata kuliah di KRS.");
            return;
        }
        MataKuliah terbaik = daftarMatakuliah[0];
        for (int i = 1; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getNilai() > terbaik.getNilai()) {
                terbaik = daftarMatakuliah[i];
            }
        }
        System.out.println("\nMata kuliah dengan nilai terbaik:");
        terbaik.tampilkanInfo();
    }

    // Menampilkan mata kuliah dengan nilai terburuk
    public void tampilkanMatkulTerburuk() {
        if (jumlahMatkul == 0) {
            System.out.println("Belum ada mata kuliah di KRS.");
            return;
        }
        MataKuliah terburuk = daftarMatakuliah[0];
        for (int i = 1; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getNilai() < terburuk.getNilai()) {
                terburuk = daftarMatakuliah[i];
            }
        }
        System.out.println("\nMata kuliah dengan nilai terburuk:");
        terburuk.tampilkanInfo();
    }

    // Menampilkan KRS
    public void tampilkanKRS() {
        System.out.println("----------------------------------------------------------");
        System.out.println("\t\tKARTU RENCANA STUDI (KRS)");
        System.out.println("----------------------------------------------------------");
        System.out.println("Nama Mahasiswa : " + mahasiswa.getNama());
        System.out.println("NPM            : " + mahasiswa.getNim());
        System.out.println("Jurusan        : " + mahasiswa.getJurusan());
        System.out.println("----------------------------------------------------------");
        System.out.println("KODE\tMATA KULIAH\t\tSKS\tNILAI");
        System.out.println("----------------------------------------------------------");

        if (jumlahMatkul == 0) {
            System.out.println("Belum ada mata kuliah yang diambil.");
        } else {
            for (int i = 0; i < jumlahMatkul; i++) {
                daftarMatakuliah[i].tampilkanInfo();
            }
        }

        System.out.println("----------------------------------------------------------");
        System.out.println("Total SKS   : " + hitungTotalSKS());
        System.out.printf("IPK Semester: %.2f\n", hitungIPK());
        System.out.println("----------------------------------------------------------\n");
    }

    // Mencari mata kuliah berdasarkan kode
    public MataKuliah cariMatakuliah(String kode) {
        for (int i = 0; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getKode().equalsIgnoreCase(kode)) {
                return daftarMatakuliah[i];
            }
        }
        return null;
    }
}
```

TugasMain :
```declarative
package modul_4;

import java.util.Scanner;

public class TugasMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("------------------------------------------------");
        System.out.println("           SISTEM KARTU RENCANA STUDI (KRS)     ");
        System.out.println("------------------------------------------------");

        // Input data mahasiswa
        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("NIM: ");
        String nim = input.nextLine();

        System.out.print("Jurusan: ");
        String jurusan = input.nextLine();

        // Membuat object mahasiswa
        Mahasiswa mhs = new Mahasiswa(nama, nim, jurusan, 0.0);

        // Membuat object KRS (maksimal 10 mata kuliah)
        TugasKartuRencanaStudi krs = new TugasKartuRencanaStudi(mhs, 10);

        boolean running = true;

        while (running) {
            System.out.println("------------------------------------------------");
            System.out.println("|                  MENU KRS                    |");
            System.out.println("------------------------------------------------");
            System.out.println("| 1. Tambah Mata Kuliah                        |");
            System.out.println("| 2. Input Nilai Mata Kuliah                   |");
            System.out.println("| 3. Hapus Mata Kuliah                         |");
            System.out.println("| 4. Tampilkan KRS                             |");
            System.out.println("| 5. Tampilkan Nilai Terbaik & Terburuk        |");
            System.out.println("| 6. Keluar                                    |");
            System.out.println("------------------------------------------------");
            System.out.print("Pilih menu: ");

            int pilihan = input.nextInt();
            input.nextLine(); // consume newline

            switch (pilihan) {
                case 1:
                    System.out.println("\nTAMBAH MATA KULIAH");
                    System.out.print("Kode Mata Kuliah: ");
                    String kode = input.nextLine();
                    System.out.print("Nama Mata Kuliah: ");
                    String namaMK = input.nextLine();
                    System.out.print("Jumlah SKS: ");
                    int sks = input.nextInt();
                    input.nextLine();
                    MataKuliah mk = new MataKuliah(kode, namaMK, sks);
                    krs.tambahMatakuliah(mk);
                    break;

                case 2:
                    System.out.print("\nMasukkan kode mata kuliah: ");
                    String kodeCari = input.nextLine();
                    MataKuliah mkCari = krs.cariMatakuliah(kodeCari);
                    if (mkCari != null) {
                        System.out.print("Nilai (0 - 100): ");
                        double nilai = input.nextDouble();
                        mkCari.setnilai(nilai);
                        System.out.println("Nilai berhasil diinput!");
                    } else {
                        System.out.println("Mata kuliah tidak ditemukan!");
                    }
                    break;

                case 3:
                    System.out.print("\nMasukkan kode mata kuliah yang ingin dihapus: ");
                    String kodeHapus = input.nextLine();
                    krs.hapusMatakuliah(kodeHapus);
                    break;

                case 4:
                    krs.tampilkanKRS();
                    break;

                case 5:
                    krs.tampilkanMatkulTerbaik();
                    krs.tampilkanMatkulTerburuk();
                    break;

                case 6:
                    running = false;
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
```

# BAB III - PENUTUP
## 3.1 Kesimpulan

&emsp;&emsp;Pada praktikum ini, konsep dasar Object Oriented Programming (OOP) telah berhasil diterapkan dengan baik melalui pembuatan kelas dan objek. Dengan memahami struktur dasar seperti atribut dan metode dalam sebuah kelas, mahasiswa dapat melihat bagaimana data dan perilaku suatu objek dapat diatur dengan lebih terstruktur dan efisien dibandingkan dengan pemrograman prosedural. Pendekatan ini membantu dalam membangun program yang lebih mudah dibaca, dipelihara, dan dikembangkan.

&emsp;&emsp;Selain itu, penggunaan prinsip OOP seperti encapsulation memberikan manfaat dalam melindungi data agar tidak dapat diakses sembarangan oleh bagian program lain. Melalui penerapan access modifier seperti private, public, dan protected, mahasiswa belajar bagaimana menjaga integritas data serta mengontrol interaksi antarobjek di dalam program. Hal ini membuktikan pentingnya konsep penyembunyian data dalam menjaga kestabilan sistem.

&emsp;&emsp;Kemudian, konsep inheritance atau pewarisan juga menjadi bagian penting yang diperkenalkan dalam praktikum ini. Dengan pewarisan, mahasiswa dapat membuat kelas turunan yang mewarisi sifat dan perilaku dari kelas induk, sehingga mengurangi pengulangan kode dan meningkatkan efisiensi dalam pengembangan program. Praktikum ini menunjukkan bagaimana pewarisan dapat memperluas fungsi kelas tanpa harus menulis ulang kode yang sama.

&emsp;&emsp;Terakhir, melalui penerapan konsep polymorphism, mahasiswa memahami bagaimana sebuah metode dapat memiliki bentuk yang berbeda tergantung pada kelas yang menggunakannya. Konsep ini membantu dalam menciptakan fleksibilitas dalam desain program, terutama ketika bekerja dengan banyak objek yang memiliki perilaku serupa namun implementasi berbeda. Dengan demikian, praktikum ini memberikan pemahaman menyeluruh tentang dasar-dasar OOP yang menjadi fondasi penting dalam pengembangan perangkat lunak modern.

## BAB IV - REFERENSI
Modul Praktikum 4 by Pak Muhammad Reza Zulman, S.ST., M.Sc.
* https://hackmd.io/@mohdrzu/Syf7Kah3ee

Web W3Schools bagian Java OOP (Object-Oriented Programming)  
* https://www.w3schools.com/java/java_oop.asp

Web W3Schools bagian Java Classes and Objects
* https://www.w3schools.com/java/java_classes.asp