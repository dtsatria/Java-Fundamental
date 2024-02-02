import java.util.Scanner;

public class ArraysDua {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int changeNumber, indexToChange = 0;
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Array Numbers");
        System.out.println("{1,2,3,4,5,6,7,8,9,10}");

        do {
            System.out.println("Masukan Posisi angka yang akan diganti 1-10 : ");
            indexToChange = inputan.nextInt();
        } while (indexToChange < 1 || indexToChange > 9);

        System.out.println("Masukan angka Pengganti :");
        changeNumber = inputan.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (indexToChange - 1 == i) {
                numbers[i] = changeNumber;
            }
        }

        inputan.close();
        System.out.println("Array setelah dirubah");
        System.out.print("{");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
        System.out.print("}");

    }
}
