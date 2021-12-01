package Chapter9;
import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        //Assigment
        //tipe data [] nama = {komponen-komponen};
        //             index = 0 1 2 3
        //                     | | | |
        int[] arryInteger =  {1,2,3,4};
        arryInteger[0] = 11;

        System.out.println(arryInteger[0]);
        System.out.println(arryInteger[1]);
        System.out.println(arryInteger[2]);
        System.out.println(arryInteger[3]);

        //deklarasi
        //tipeda[] nama = new int[jumlah arraynya];

        System.out.println("Deklarasi Array");
        float[] arrayFloat = new float[5];
        arrayFloat[3] = 11.5f;

        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);

        System.out.println(Arrays.toString(arryInteger));




    }

}
