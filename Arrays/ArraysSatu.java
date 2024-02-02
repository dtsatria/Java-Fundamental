import java.util.Scanner;

public class ArraysSatu {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int findNumber = 0, count = 0;
        int numbers[] = { 3, 2, 5, 11, 7, 10, 11, 3, 15, 11, 10, 17, 5 };
        boolean isThere = false;

        System.out.println("Masukan angka yang dicari :");
        findNumber = inputan.nextInt();
        inputan.close();
        for (int i = 0; i < numbers.length; i++) {
            if (findNumber == numbers[i]) {
                isThere = true;
                count++;
            }
        }

        if (isThere == true) {
            System.out.println("Angka " + findNumber + " yang anda cari didalam array");
            System.out.println("Ada " + count + " angka " + findNumber + " didalam array.");
            System.out.println("yaitu pada index : ");
            for (int i = 0; i < numbers.length; i++) {
                if (findNumber == numbers[i]) {
                    System.out.println(i + " ");
                }
            }
        } else {
            System.out.println("Angka " + findNumber + " tidak ditemukan");
        }
    }
}