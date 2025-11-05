package Modul_5.praktikum_1;

public class Person {
    // Private (hanya bisa diakses dalam class ini)
    private String nama;
    private int umur;

    // Default (bisa diakses dalam package yang sama)
    String alamat;

    // Protected (bisa diakses dalam package yang sama atau subclass)
    protected String telepon;

    // Public (bisa diakses dari mana saja)
    public String email;

    // Constructor
    public Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Public method untuk menampilkan data private
    public void tampilkanInfo() {
        System.out.println("\nDATA PERSON:");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
    }

    // Private method (hanya bisa dipanggil di dalam class)
    private void metodePribadi() {
        System.out.println("Ini adalah method private!");
    }

    // Public method untuk memanggil method private
    public void panggilMetodePribadi() {
        metodePribadi();
    }
}