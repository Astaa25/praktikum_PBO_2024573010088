package modul_2;

import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Contoh While Loop
        System.out.println("=== While Loop - Tebak Angka ===");
        int angkarahasia = 9;
        int tebakan = 0;

        while(tebakan != angkarahasia){
            System.out.print("Tebak Angka (1-10) : ");
            tebakan = input.nextInt();

            if(tebakan < angkarahasia){
                System.out.println("Terlalu Kecil");
            } else if (tebakan > angkarahasia) {
                System.out.println("Terlalu Besar");
            }else{
                System.out.println("Benar! Angka Rahasianya Adalah: " + angkarahasia);
            }
        }

        // Contoh Do-While Loop
        System.out.println("\n=== Do-While Loop - Menu ===");
        int pilihan;

        do {
            System.out.println("\n1. Tampilkan Pesan");
            System.out.println("2. Hitung Faktorial");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu : ");
            pilihan = input.nextInt();

            switch (pilihan){
                case 1:
                    System.out.println("Hello World");
                    break;
                case 2:
                    System.out.print("Masukan Angka : ");
                    int n = input.nextInt();
                    long faktorial = 1;
                    for(int i =1; i <n ; i++){
                        faktorial *= i;
                    }
                    System.out.println("Faktorial " + n + " = " + faktorial);
                    break;
                case 3:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid");
                    break;
            }
        } while (pilihan != 3);
        input.close();
    }
}
