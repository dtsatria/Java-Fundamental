import java.util.Scanner;

public class JobVacancyVersiDua {
    public static void main(String[] args) {
        String nama, kelamin, lulusan, posisi, hasil;
        Integer umur, pengalaman, penampilan;
        Boolean isKoordinator1, isKoordinator2, isAdmin1, isAdmin2, isAdmin3, isSpv1, isSpv2;

        Scanner inputan = new Scanner(System.in);

        // --START Inputan User--
        System.out.println("Nama :");
        nama = inputan.next();
        System.out.println("Umur :");
        umur = inputan.nextInt();
        System.out.println("Jenis Kelamin(Pria/Wanita) :");
        kelamin = inputan.next();
        System.out.println("Lulusan :");
        lulusan = inputan.next();
        System.out.println("Pengalaman :");
        pengalaman = inputan.nextInt();
        System.out.println("Penampilan (1/10) :");
        penampilan = inputan.nextInt();
        System.out.println("Posisi yang dilamar");
        System.out.println("(SPV, Admin, Or Koordinator) :");
        posisi = inputan.next();

        inputan.close();
        // --END INPUTAN USER

        if (posisi.equalsIgnoreCase("Koordinator")) {
            isKoordinator1 = kelamin.equalsIgnoreCase("Pria") && pengalaman >= 2 && umur >= 21 && umur <= 30
                    && lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3");
            isKoordinator2 = kelamin.equalsIgnoreCase("Pria") && umur >= 30 && lulusan.equalsIgnoreCase("S1")
                    && pengalaman >= 5;
            if (isKoordinator1 || isKoordinator2) {
                hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai " + posisi
                        + ". Dan akan masuk ke Tahap selanjutnya";
            } else {
                hasil = "Maaf, " + nama + ".\nAnda Tidak memenuhi syarat sebagai " + posisi
                        + ". Dan Tidak akan masuk ke tahap selanjutnya.";
            }

        } else if (posisi.equalsIgnoreCase("SPV")) {
            isSpv1 = umur >= 23 && umur <= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 1;
            isSpv2 = umur >= 25 && umur <= 35 && lulusan.equalsIgnoreCase("D3") && pengalaman >= 4;
            if (isSpv1 || isSpv2) {
                hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai " + posisi
                        + ". Dan akan masuk ke Tahap selanjutnya";
            } else {
                hasil = "Maaf, " + nama + ".\nAnda Tidak memenuhi syarat sebagai " + posisi
                        + ". Dan Tidak akan masuk ke tahap selanjutnya.";
            }

        } else if (posisi.equalsIgnoreCase("Admin")) {
            isAdmin1 = kelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3")
                    &&
                    penampilan >= 8 || pengalaman >= 1;
            isAdmin2 = kelamin.equalsIgnoreCase("Wanita") && umur >= 25 && lulusan.equalsIgnoreCase("S1") &&
                    penampilan >= 8 && pengalaman >= 3;
            isAdmin3 = kelamin.equalsIgnoreCase("Pria") && umur >= 20 && umur <= 30 &&
                    penampilan >= 8 && pengalaman >= 2 && lulusan.equalsIgnoreCase("D3")
                    || lulusan.equalsIgnoreCase("S1");
            if (isAdmin1 || isAdmin2 || isAdmin3) {
                hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai " + posisi
                        + ". Dan akan masuk ke Tahap selanjutnya";
            } else {
                hasil = "Maaf, " + nama + ".\nAnda Tidak memenuhi syarat sebagai " + posisi
                        + ". Dan Tidak akan masuk ke tahap selanjutnya.";
            }
        } else {
            hasil = "Posisi tidak tersedia atau Periksa kembali ejaan posisi yang dilamar :)";
        }

        System.out.println("======= OUTPUT =======");
        System.out.println(nama + ", Terima kasih sudah mengikuti lowongan kerja di PT. Secret Semut");
        System.out.println();
        System.out.println("Beriku Hasil dari Rekrutmen :");
        System.out.println(hasil);

    }
}