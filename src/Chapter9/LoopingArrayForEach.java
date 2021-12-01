package Chapter9;
import java.util.Arrays;
public class LoopingArrayForEach {
    public static void main(String[] args) {

        int[] arrayAangka = {21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 1, 2, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(arrayAangka));

        // looping standar
        System.out.println("Looping biasa");
        for (int i = 0; i < 10; i++) {
            System.out.println("Index ke-" + i + "adalah = " + arrayAangka[i]);
        }

        // looping dengan properti dari array
        System.out.println("looping properti");
        for (int i = 0; i < arrayAangka.length; i++);{
            System.out.println();
        }
        System.out.println("Looping dengan for each");
for (int angka : arrayAangka){
    System.out.println("angka pada looping ini = " + angka );
}

}
}