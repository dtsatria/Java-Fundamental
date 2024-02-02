import java.util.Scanner;

public class JobVacancy {
    public static void main(String[] args) {
        String nama, jenisKelamin, lulusan;
        Integer umur, pengalaman, penampilan;
        boolean koorCriteria1, koorCriteria2, adminCriteria1, adminCriteria2, isAdmin, isKoor;
        Scanner inputan = new Scanner(System.in);

        // --Start Inputan User--
        System.out.println("========== INPUT ==========");
        System.out.println("Nama: ");
        nama = inputan.next();

        System.out.println("Umur: ");
        umur = inputan.nextInt();

        System.out.println("Jenis Kelamin (Pria/Wanita): ");
        jenisKelamin = inputan.next();

        System.out.println("Lulusan: ");
        lulusan = inputan.next();

        System.out.println("Pengalaman (Tahun): ");
        pengalaman = inputan.nextInt();

        System.out.println("Penampilan(1/10): ");
        penampilan = inputan.nextInt();
        System.out.println();
        inputan.close();
        // --End Inputan User--

        // --Start Logic IsKordinator--
        koorCriteria1 = lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3") &&
                umur >= 21 || umur <= 30 && pengalaman >= 2 && jenisKelamin.equalsIgnoreCase("Pria");
        koorCriteria2 = lulusan.equalsIgnoreCase("S1") &&
                umur >= 30 && pengalaman >= 5 && jenisKelamin.equalsIgnoreCase("Pria");
        isKoor = koorCriteria1 || koorCriteria2;
        // --End Logic IsKordinator--

        // --Start Logic IsAdmin--
        adminCriteria1 = lulusan.equalsIgnoreCase("D3") &&
                umur >= 20 || umur <= 25 && pengalaman >= 1
                || penampilan >= 8.5 && jenisKelamin.equalsIgnoreCase("Wanita");
        adminCriteria2 = lulusan.equalsIgnoreCase("S1") &&
                umur >= 25 && pengalaman >= 5 && penampilan >= 8.5 && jenisKelamin.equalsIgnoreCase("Wanita");
        isAdmin = adminCriteria1 || adminCriteria2;
        // --End Logic IsAdmin--

        // --Start Output pada user--
        System.out.println("========== OUTPUT ==========");
        System.out.println(nama + ", terima kasih sudah mengikuti lowongan kerja di PT. Tujuh Sembilan.");
        System.out.println();
        System.out.println("Berikut hasil dari Rekrutmen : ");
        System.out.println("Hasil kelulusan untuk Kordinator :" + isKoor);
        System.out.println("Hasil kelulusan untuk Admin :" + isAdmin);// --End Output pada user--
        // --End Output pada user--
    }
}
