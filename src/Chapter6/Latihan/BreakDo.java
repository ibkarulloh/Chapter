package Chapter6.Latihan;

public class BreakDo {
    public static void main(String[] args) {
        int number = 0;
        do {
            number++;
            if (number == 10) {
                break;
            }
            System.out.print(number + " ");
        } while (number < 20);

    }
}
