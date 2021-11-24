package Chapter6.Tugas;

import java.util.Scanner;

public class Bintang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the stars : ");
        int stars = input.nextInt();
        for (int rows = 1; rows <= stars; rows++) {
            for (int s = stars - rows; s >= 1; s--) {
                System.out.print(" ");
            }
            for (int l = rows; l >= 2; l--) {
                System.out.print(l + " ");
            }
            for (int r = 1; rows <= 1; r++) {
                System.out.print(r + " ");
            }
            System.out.println();
        }
    }
}