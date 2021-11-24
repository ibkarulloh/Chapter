package Chapter7.latihan;

import java.util.Scanner;

public class method20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int i = input.nextInt();
        int j = input.nextInt();
        int z = input.nextInt();
        int k = max(i, j, z);
        System.out.println("The maximum between " + i + " and " + j +  "  " + z + " is: " + k );
    }
    public static int max(int numb1, int numb2, int numb3){
        int result;
        if (numb1 < numb2 && numb1 < numb3)
            result = numb1;
        else result = Math.min(numb2, numb3);
        return result;
    }
}
