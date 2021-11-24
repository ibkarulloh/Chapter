package Chapter5.Latihan;

public class TestBreak {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        while (number < 20) {
            number++;
            if (number == 10) {
                break;
            }
            System.out.print(number + " ");
        }
    }
}