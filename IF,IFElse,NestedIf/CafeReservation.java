import java.util.Scanner;

public class CafeReservation {
    public static void main(String[] args) {
        String nama, kelamin, hari, hasil;
        Integer umur, attractive, uang;

        Scanner inputan = new Scanner(System.in);

        // --START Inputan User--
        System.out.println("Masukan Nama anda :");
        nama = inputan.next();
        System.out.println("Berapa umur anda :");
        umur = inputan.nextInt();
        System.out.println("Jenis Kelamin(Pria/Wanita) :");
        kelamin = inputan.next();
        System.out.println("Seberapa menarik anda :");
        attractive = inputan.nextInt();
        System.out.println("Berapa uang yang anda miliki :");
        uang = inputan.nextInt();
        System.out.println("Pada hari apa anda ingin melakukan Reservasi :");
        hari = inputan.next();

        inputan.close();
        // --END INPUTAN USER
        if (hari.equalsIgnoreCase("Senin")) {
            if (umur >= 20 && umur <= 30 && uang >= 500) {
                hasil = "Diterima";
            } else {
                hasil = "Maaf Hari " + hari + " hanya untuk anak muda";
            }
        } else if (hari.equalsIgnoreCase("Selasa")) {
            if (umur >= 31 && umur <= 50 && uang >= 250) {
                hasil = "Diterima";
            } else {
                hasil = "Maaf Hari " + hari + " hanya untuk para tetua";
            }
        } else if (hari.equalsIgnoreCase("Rabu")) {
            if (umur >= 20 && umur <= 35 && kelamin.equalsIgnoreCase("Wanita") &&
                    attractive >= 8 && uang >= 300) {
                hasil = "Diterima";
            } else {
                hasil = "Maaf Hari " + hari + " hanya untuk para gadis";
            }
        } else if (hari.equalsIgnoreCase("Kamis")) {
            if (kelamin.equalsIgnoreCase("Wanita") && umur >= 21 && umur <= 30 && uang >= 300) {
                hasil = "Diterima";
            } else if (kelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30 && uang >= 1000) {
                hasil = "Diterima";
            } else {
                hasil = "Maaf Hari " + hari + " hanya untuk para Tuna Asmara alias Single";
            }
        } else if (hari.equalsIgnoreCase("Jumat")) {
            if (kelamin.equalsIgnoreCase("Wanita") && umur >= 31 && umur <= 45 && uang >= 1000) {
                hasil = "Diterima";
            } else if (kelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 25 && attractive >= 8) {
                hasil = "Diterima";
            } else {
                hasil = "Maaf Hari " + hari + " hanya untuk para Wanita";
            }
        } else if (hari.equalsIgnoreCase("Sabtu") || hari.equalsIgnoreCase("Minggu")) {
            if (umur >= 18 && umur <= 60 && uang >= 100) {
                hasil = "Diterima";
            } else {
                hasil = "Maaf Hari " + hari + " hanya untuk Pesta Kebebasan Weeknd";
            }
        } else {
            hasil = "mohon pilih hari dahulu atau periksa ejaan nya :)";
        }

        System.out.println("====== OUTPUT ======");
        System.out.println("Hi " + nama + ",Terima kasih sudah menggunakan aplikasi ini");
        System.out.println("Hasil Reservasi kamu adalah :");
        System.out.println(hasil);

    }
}