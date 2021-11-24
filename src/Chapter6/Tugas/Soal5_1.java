package Chapter6.Tugas;

import java.util.Scanner;

public class Soal5_1 {
    public static void main(String[] args) {


            Scanner input = new Scanner(System.in);
            int positives = 0;
            int negatives = 0;
            int count = 0;
            double total = 0;

            System.out.print("Masukkan integer, input berakhir jika 0: ");

            int number = input.nextInt();
            if (number == 0) { //  Test for sentinel value

                System.out.println("Tidak ada angka yang dimasukkan kecuali 0");

                System.exit(1);
            }

            while (number != 0) {

                if (number > 0)
                    positives++;
                else

                    negatives++;

                total += number;

                count++;

                number = input.nextInt();

            }

            double average = total / count;


            System.out.println(

                    "Jumlah positif adalah " + positives + "\nJumlah negatif adalah " + negatives +

                            "\nTotalnya adalah " + total +

                            "\nRata-rata adalah " + average);
        }
    }

