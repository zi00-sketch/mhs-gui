import java.util.Scanner;

public class PenilaianMahasiswa {
    public static void main(String[] args) {
        // --- 1. VARIABLE ---
        // Mendeklarasikan variabel untuk menyimpan data mahasiswa
        String namaMahasiswa;
        String nim;
        double nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
        char grade;
        String status;

        // Inisialisasi Scanner untuk menerima input dari keyboard
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Penilaian Mahasiswa ===");
        
        // Input Data
        System.out.print("Masukkan Nama Mahasiswa: ");
        namaMahasiswa = input.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = input.nextLine();

        System.out.print("Masukkan Nilai Tugas (0-100): ");
        nilaiTugas = input.nextDouble();
        System.out.print("Masukkan Nilai UTS (0-100): ");
        nilaiUTS = input.nextDouble();
        System.out.print("Masukkan Nilai UAS (0-100): ");
        nilaiUAS = input.nextDouble();

        // --- 2. OPERATORS ---
        // Menggunakan operator aritmatika untuk menghitung nilai akhir
        // Bobot: Tugas 20%, UTS 35%, UAS 45%
        nilaiAkhir = (nilaiTugas * 0.20) + (nilaiUTS * 0.35) + (nilaiUAS * 0.45);

        // --- 3. CONDITION (if... else...) ---
        // Menentukan Grade berdasarkan nilai akhir
        if (nilaiAkhir >= 85) {
            grade = 'A';
        } else if (nilaiAkhir >= 75) {
            grade = 'B';
        } else if (nilaiAkhir >= 65) {
            grade = 'C';
        } else if (nilaiAkhir >= 50) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        // Menentukan Status Kelulusan menggunakan operator perbandingan dan if...else
        if (nilaiAkhir >= 60) {
            status = "LULUS";
        } else {
            status = "TIDAK LULUS";
        }

        // Menampilkan Hasil Akhir
        System.out.println("\n--- Hasil Penilaian ---");
        System.out.println("Nama        : " + namaMahasiswa);
        System.out.println("NIM         : " + nim);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Grade       : " + grade);
        System.out.println("Status      : " + status);
        System.out.println("-----------------------");

        input.close();
    }
}
