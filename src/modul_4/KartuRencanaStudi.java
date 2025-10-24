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
