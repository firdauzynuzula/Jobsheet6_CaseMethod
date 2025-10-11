import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tugas_1, uts_1, uas_1;
        int tugas_2, uts_2, uas_2;
        String nama, nim;
        String paraf = "BAIK";
        String statusKelulusan = "BYUH";

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

        double nilaiAkhir_1 = (tugas_1 * 0.3) + (uts_1 * 0.3) + (uas_1 * 0.4);
        
        // Hasil atau output
        System.out.println("\n");
        System.out.println("========== HASIL PENILAIAN AKADEMIK ==========");
        System.out.println("Nama : " + nama);
        System.out.println("Nim  : " + nim);
        System.out.println("\n");
        
        System.out.println("Mata kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Algoritma Pemrograman" + "\t" + uts_1 + "\t" + uas_1 + "\t" + tugas_1 + "\t" + nilaiAkhir_1  + "\t\t" + paraf + "\t\t" + statusKelulusan);
        System.out.println("Struktur Data" + "\t\t" + uts_2 + "\t" + uas_2 + "\t" + tugas_2 + "\t" + nilaiAkhir_1 + "\t\t"+ paraf + "\t\t" + statusKelulusan);
    }

}