package Chapter6.Latihan;

public class No13TestFor {
    public static void main(String[] args) {
        int number = 0;
        while (number < 20) {
            number++;
            if (number == 10) {
                continue;
            }
            System.out.print(number + " ");
        }
    }

}
