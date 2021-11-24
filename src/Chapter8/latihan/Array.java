package Chapter8.latihan;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] a;
        try (Scanner input = new Scanner(System.in)) {
            a = new int[10];
            System.out.println(Arrays.toString(a) + " ");
            for (int i = 0; i < 10; i++) {
                a[i] = input.nextInt();
            }
        }
        for (int j : a)
            System.out.print(j + " ");
    }
}
