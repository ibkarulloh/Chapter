package Chapter5.Latihan;

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(
                "Enter an integer (the input ends if it is 0): ");
        int data = input.nextInt();

        // Keep reading data until the input is 0
        int sum = 0;
        while (data != 0) {
            sum += data;

            // Read the next data
            System.out.print(
                    "Enter an integer (the input ends if itn is 0): ");
            data = input.nextInt() ;
        }
        System.out.println("The sum is " + sum);
    }
}
