package Chapter6.Latihan;

public class BreakFor {
    public static void main(String[] args) {
        ;
        int number;
        for (number = 0; number < 20; number++) {
            if (number == 10) {
                break;
            }
            System.out.print(number + " ");
        }
    }
}