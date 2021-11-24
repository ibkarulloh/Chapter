package Chapter6.Latihan;

public class Deret3 {
    public static void main(String[] args) {
        int x = 2;
        int y = 6;
        while (y <= 38){
            while (x <= 200){
                System.out.print(x + " ");
                x = x + y;
                y = y + 4;
            }
        }
    }
}
