package modul_1.DataDiri;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataDiri {
    public static void main(String[] args) {
        String nama = "Abrar Astafaraiz";
        String nim = "2024573010088" ;
        LocalDate TglLahir = LocalDate.of(2006,12,1);
        String kelas = "TI 2A" ;
        int angkatan = 24 ;
        int semester = 3 ;
        String prodi = "Teknik Informatika";
        String jurusan = "Teknologi Informasi dan Komputer";

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("===== DATA MAHASISWA =====");
        System.out.println("Nama : " + nama );
        System.out.println("NIM : " + nim );
        System.out.println("Tanggal Lahir : " + TglLahir.format(format) );
        System.out.println("Kelas : " + kelas );
        System.out.println("Angkatan : " + angkatan );
        System.out.println("Semester : " + semester );
        System.out.println("Prodi : " + prodi );
        System.out.println("Jurusan : " + jurusan );
    }

}
