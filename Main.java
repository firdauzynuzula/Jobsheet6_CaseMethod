import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tugas_1, uts_1, uas_1, tugas_2, uts_2, uas_2;
        int tugas_3, uts_3, uas_3;
        String nama, nim;

        //input data mahasiswa
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

        System.out.println("\n");
        System.out.println("--- Mata kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS    : ");
        uts_2 = input.nextInt();
        System.out.print("Nilai UAS    : ");
        uas_2 = input.nextInt();
        System.out.print("Nilai Tugas  : ");
        tugas_2 = input.nextInt();

        System.out.println("\n");
        System.out.println("--- Mata kuliah 3: Java ---");
        System.out.print("Nilai UTS    : ");
        uts_3 = input.nextInt();
        System.out.print("Nilai UAS    : ");
        uas_3 = input.nextInt();
        System.out.print("Nilai Tugas  : ");
        tugas_3 = input.nextInt();

        input.close();

        if (tugas_1 > 0 && tugas_1 <= 100 && uts_1 > 0 && uts_1 <= 100 && uas_1 > 0 && uas_1 <= 100 &&
                tugas_2 > 0 && tugas_2 <= 100 && uts_2 > 0 && uts_2 <= 100 && uas_2 <= 0 && uas_2 <= 100 &&
                tugas_3 > 0 && tugas_3 <= 100 && uts_3 > 0 && uts_3 <= 100 && uas_3 > 0 && uas_3 <= 100) {
            System.out.println("Nilai yang dimasukkan tidak valid. Nilai harus antara 0 hingga 100.");
            // return;
        } else {

            // proses perhitungan nilai akhir dan status kelulusan matakuliah 1
            double nilaiAkhir_1 = (tugas_1 * 0.3) + (uts_1 * 0.3) + (uas_1 * 0.4);
            String paraf = "", statusKelulusan = "";

            if (nilaiAkhir_1 > 80 && nilaiAkhir_1 <= 100) {
                paraf = "A";
                statusKelulusan = "LULUS";
            } else if (nilaiAkhir_1 > 73 && nilaiAkhir_1 <= 80) {
                paraf = "B+";
                statusKelulusan = "LULUS";
            } else if (nilaiAkhir_1 > 65 && nilaiAkhir_1 <= 73) {
                paraf = "B";
                statusKelulusan = "LULUS";
            } else if (nilaiAkhir_1 > 60 && nilaiAkhir_1 <= 65) {
                paraf = "C+";
                statusKelulusan = "LULUS";
            } else if (nilaiAkhir_1 > 50 && nilaiAkhir_1 <= 60) {
                paraf = "C";
                statusKelulusan = "TIDAK LULUS";
            } else if (nilaiAkhir_1 > 39 && nilaiAkhir_1 <= 50) {
                paraf = "D";
                statusKelulusan = "TIDAK LULUS";
            } else {
                paraf = "E";
                statusKelulusan = "TIDAK LULUS";
            }

            // proses perhitungan nilai akhir dan status kelulusan matakuliah 2
            double nilaiAkhir_2 = (tugas_2 * 0.3) + (uts_2 * 0.3) + (uas_2 * 0.4);
            String statusKelulusanMatkul2 = "";
            String parafMatkul2;

            if (nilaiAkhir_2 > 80 && nilaiAkhir_2 <= 100) {
                parafMatkul2 = "A";
                statusKelulusanMatkul2 = "LULUS";
            } else if (nilaiAkhir_2 > 73 && nilaiAkhir_2 <= 80) {
                parafMatkul2 = "B+";
                statusKelulusanMatkul2 = "LULUS";
            } else if (nilaiAkhir_2 > 65 && nilaiAkhir_2 <= 73) {
                parafMatkul2 = "B";
                statusKelulusanMatkul2 = "LULUS";
            } else if (nilaiAkhir_2 > 60 && nilaiAkhir_2 <= 65) {
                parafMatkul2 = "C+";
                statusKelulusanMatkul2 = "LULUS";
            } else if (nilaiAkhir_2 > 50 && nilaiAkhir_2 <= 60) {
                parafMatkul2 = "C";
                statusKelulusanMatkul2 = "TIDAK LULUS";
            } else if (nilaiAkhir_2 > 39 && nilaiAkhir_2 <= 50) {
                parafMatkul2 = "D";
                statusKelulusanMatkul2 = "TIDAK LULUS";
            } else {
                parafMatkul2 = "E";
                statusKelulusanMatkul2 = "TIDAK LULUS";
            }

            // Hasil atau output
            System.out.println("\n");
            System.out.println("========== HASIL PENILAIAN AKADEMIK ==========");
            System.out.println("Nama : " + nama);
            System.out.println("Nim  : " + nim);
            System.out.println("\n");

            System.out.println("Mata kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
            System.out.println("-------------------------------------------------------------------");

            System.out.println("Algoritma Pemrograman" + "\t" + uts_1 + "\t" + uas_1 + "\t" + tugas_1 + "\t"
                    + nilaiAkhir_1 + "\t\t" + paraf + "\t\t" + statusKelulusan);
            System.out.println("Struktur Data" + "\t\t" + uts_2 + "\t" + uas_2 + "\t" + tugas_2 + "\t" + nilaiAkhir_2
                    + "\t\t" + parafMatkul2 + "\t\t" + statusKelulusanMatkul2);

            System.out.println("Java" + "\t\t\t" + uts_3 + "\t" + uas_3 + "\t" + tugas_3 + "\t");

            // menentukan kelulusan berdasarkan rata-rata nilai akhir
            double rataRata = (nilaiAkhir_1 + nilaiAkhir_2) / 2;
            System.out.println("\n");
            System.out.println("Rata-rata nilai akhir: " + rataRata);

            String[] outputCondition = { "LULUS", "TIDAK LULUS (Rata-Rata < 70)" };
            if (rataRata >= 70) {
                System.out.println(outputCondition[0]);
            }
            if (rataRata < 70) {
                System.out.println("Status Semester : " + outputCondition[1]);
            }
        }
    }
}