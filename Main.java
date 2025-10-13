package Functional_Programming_implementation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tugas_1, uts_1, uas_1;
        int tugas_2, uts_2, uas_2;
        String nama, nim;

        System.out.println("==== INPUT DATA MAHASISWA ====");
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("Nim  : ");
        nim = input.nextLine();
        System.out.println("\n");

        System.out.println("--- Mata kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS    : ");
        uts_1 = input.nextInt();
        System.out.print("Nilai UAS    : ");
        uas_1 = input.nextInt();
        System.out.print("Nilai Tugas  : ");
        tugas_1 = input.nextInt();

        System.out.println("--- Mata kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS    : ");
        uts_2 = input.nextInt();
        System.out.print("Nilai UAS    : ");
        uas_2 = input.nextInt();
        System.out.print("Nilai Tugas  : ");
        tugas_2 = input.nextInt();
        input.close();

        hasilInputan(nama, nim, tugas_1, uts_1, uas_1, tugas_2, uts_2, uas_2);
    }
    
    public static void hasilInputan(String nama, String nim, int tugas_1, int uts_1, int uas_1, int tugas_2, int uts_2, int uas_2) {
        double nilaiAkhir1 = (0.3 * tugas_1) + (0.35 * uts_1) + (0.35 * uas_1);
        double nilaiAkhir2 = (0.3 * tugas_2) + (0.35 * uts_2) + (0.35 * uas_2);

        System.out.println("\n==== OUTPUT DATA MAHASISWA ====");
        System.out.println("Nama : " + nama);
        System.out.println("Nim  : " + nim);
        System.out.printf("Nilai Akhir Mata Kuliah 1 (Algoritma dan Pemrograman): %.2f\n", nilaiAkhir1);
        System.out.printf("Nilai Akhir Mata Kuliah 2 (Struktur Data): %.2f\n", nilaiAkhir2);


        System.out.println("\nTerima kasih telah menggunakan program ini!");
        System.out.println("program ini berakhir disini");
        penghitunganNilai(tugas_2, uts_2, uas_2);

    }

    public static int penghitunganNilai(int tugas , int uts , int uas_1) {
        double nilaiAkhir = (0.3 * tugas) + (0.35 * uts) + (0.35 * uas_1);
        return (int) nilaiAkhir;
    }

}