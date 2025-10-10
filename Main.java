import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tugas_1, uts_1, uas_1;
        int tugas_2, uts_2, uas_2;
        String nama, nim;
        String hahahaha;

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

        // Hasil atau output
        System.out.println("\n");
        System.out.println("========== HASIL PENILAIAN AKADEMIK ==========");
        System.out.println("Nama : " + nama);
        System.out.println("Nim  : " + nim);
        System.out.println("\n");

        System.out.println("Mata kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("-------------------------------------------------------------------");
        BelajarNihBro();
        
    }
    
    public static void BelajarNihBro() {
        System.out.println("hello world");
    }


}