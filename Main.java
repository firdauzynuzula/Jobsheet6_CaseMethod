import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tugas_1, uts_1, uas_1;
        int tugas_2, uts_2, uas_2;
        String nama, nim;
        char huruf = 'A';
        String Status = "Lulus";
        int nilaiAkhir = 90;

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
        System.out.println("Algoritma Pemrograman" + "\t" + uts_1 + "\t" + uas_1 + "\t\t" + tugas_1 + "\t" + nilaiAkhir + "\t" + huruf + "\t" + Status);
        System.out.println("Struktur Data");
        
    }
    
    public static void BelajarNihBro() {
        System.out.println("hello world");
    }


}