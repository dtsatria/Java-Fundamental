import java.util.Scanner;

public class MenerimaInputUser {
    public static void main(String[] args) {
        String name;
        Integer total, totalDay, moneySpent;
        Double average;

        totalDay = 7;

        Scanner inputan = new Scanner(System.in);

        System.out.println("Siapa Nama Anda");
        name = inputan.next();

        System.out.println("Berapa yang kamu habiskan di hari minggu ?");
        moneySpent = inputan.nextInt();

        System.out.println("Berapa yang kamu habiskan di hari senin ?");
        moneySpent = moneySpent + inputan.nextInt();

        System.out.println("Berapa yang kamu habiskan di hari selasa ?");
        moneySpent = moneySpent + inputan.nextInt();

        System.out.println("Berapa yang kamu habiskan di hari rabu ?");
        moneySpent = moneySpent + inputan.nextInt();

        System.out.println("Berapa yang kamu habiskan di hari kamis ?");
        moneySpent = moneySpent + inputan.nextInt();

        System.out.println("Berapa yang kamu habiskan di hari jum'at ?");
        moneySpent = moneySpent + inputan.nextInt();

        System.out.println("Berapa yang kamu habiskan di hari sabtu ?");
        moneySpent = moneySpent + inputan.nextInt();

        inputan.close();

        total = moneySpent;
        average = (double) moneySpent / totalDay;

        System.out.println("Hasil Perhitungan :");
        System.out.println("Hi, " + name);
        System.out.println("Total Pengeluaranmu minggu ini adalah : Rp." + total);
        System.out.println("Rata-rata pengeluaranmu per-hari adalah : Rp." + average);
    }
}