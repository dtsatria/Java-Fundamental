import java.util.Scanner;

public class PassingGrade {
    public static void main(String[] args) {
        int NilaiMtk, NilaiIndo, NilaiInggris, NilaiIpa, NilaiAvg, NilaiSastra;
        boolean IsSastra, IsTkj, IsLulus;

        Scanner inputan = new Scanner(System.in);
        // --Start Input User--
        System.out.println("Masukan Nilai Matematika :");
        NilaiMtk = inputan.nextInt();

        System.out.println("Masukan Nilai Bhs.Indonesia :");
        NilaiIndo = inputan.nextInt();

        System.out.println("Masukan Nilai Bhs.Inggris :");
        NilaiInggris = inputan.nextInt();

        System.out.println("Masukan Nilai IPA :");
        NilaiIpa = inputan.nextInt();

        inputan.close();
        // --END Input User--

        // --Start Logic Passing Grade--
        NilaiAvg = (NilaiMtk + NilaiIndo + NilaiInggris + NilaiIpa) / 4;
        NilaiSastra = (NilaiIndo + NilaiInggris) / 2;
        IsLulus = NilaiAvg >= 73;
        IsSastra = NilaiSastra >= 75;
        IsTkj = NilaiMtk >= 80;
        // --END Logic Passing Grade--

        System.out.println("Hasil Simulasi Persyaratan Penerimaan Calon Siswa di SMK Padepokan 79 :");
        System.out.println("=======================================================================");
        System.out.println("Memenuhi Syarat untuk Masuk ke SMK Padepokan 79 : " + IsLulus);
        System.out.println("Memenuhi Syarat untuk Masuk ke Jurusan Sastra : " + IsSastra);
        System.out.println("Memenuhi Syarat untuk Masuk ke Jurusan TKJ : " + IsTkj);

    }
}