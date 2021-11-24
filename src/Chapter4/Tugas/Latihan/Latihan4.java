package Chapter4.Tugas.Latihan;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hax digit: ");
        String hexString = input.nextLine();


        // Check if the hex string has exactly one character
        if (hexString.length() != 1) {
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }
        char ch = Character.toUpperCase(hexString.charAt(0));
        if ('A' <= ch && ch <= 'F') {
            int value = ch - 'A' + 10;
            System.out.printf("The decimal value for hex digit" + ch + " is "  + value);
        }

        // Display decimal value for the hex digit
        else if (Character.isDigit(ch)) {
            System.out.println("The decimal value for hex digit "
                    + ch + " is " + ch);
        }
        else {
            System.out.println(ch + " is an invalid input");
        }
    }
}
