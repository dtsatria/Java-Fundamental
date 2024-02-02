import java.util.Scanner;

public class ForTebakAngka {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int angka, tebakan;
        boolean pass = false;

        angka = 2 + (int) (Math.random() * 5);
        System.out.println("Tebak angka dari 1 - 5");
        System.out.println("Kamu hanya punya 3x kesempatan");
        System.out.println("Angka Tebakanmu :");

        for (int i = 0; i < 3; i++) {
            tebakan = inputan.nextInt();
            if (tebakan == angka) {
                System.out.println("Tebakan kamu benar ! Selamat !");
                pass = true;
                break;
            } else if (Math.abs(tebakan - angka) == 1) {
                System.out.println("hot");
            } else if (Math.abs(tebakan - angka) == 2) {
                System.out.println("warm");
            } else {
                System.out.println("cold");
            }
        }

        inputan.close();

        if (pass == false) {
            System.out.println("Tebakan kamu salah, kamu kalah tebakan");
        }
    }
}