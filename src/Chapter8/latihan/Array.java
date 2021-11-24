package Chapter8.latihan;


import javax.swing.*;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        int[] nilai = new int[10];
        int max,min;
        int i;

        for (i = 0; i<10; i++)
        {
            String bilangan = JOptionPane.showInputDialog("Masukkan Nilai: ");
            nilai[i] = Integer.parseInt(bilangan);
            System.out.println("Input Angka: "+bilangan);
        }


        min=nilai[0];
        max=nilai[0];
        for (i=0; i<10; i++){
            if(nilai[i] > max){
                max = nilai[i];
            }
            else if(nilai[i] < min){
                min = nilai[i];
            }
        }
        System.out.println("--------------------------------");
        System.out.println("Nilai Max = "+max);
        System.out.println("Nilai Min = "+min);
    }
}