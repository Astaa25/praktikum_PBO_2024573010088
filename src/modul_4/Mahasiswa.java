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
