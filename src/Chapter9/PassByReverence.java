package Chapter9;
import  java.util.Arrays;
public class PassByReverence {
    public static void main(String[] args) {
        int[] arrayAngka1 = {1,2,3,4,5};
        int[] arrayAngka2 = new  int[5];

        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        arrayAngka2 = arrayAngka1;

        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);

        System.out.println("Array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2 -> " + Arrays.toString(arrayAngka2));

        arrayAngka1[0] = 100;
        arrayAngka2 [4] = 500;

        System.out.println("Array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2 -> " + Arrays.toString(arrayAngka2));

        ubahArray(arrayAngka1);

        System.out.println("Array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2 -> " + Arrays.toString(arrayAngka2));
    }
    //method argumennya reference, pass by reference
    private  static  void  ubahArray (int[] dataArray){
     //   for (int data: dataArray){
         //   System.out.println(data);
      //  }
        dataArray[0] = 125;
        //for (int data: dataArray){
         //   System.out.println(data);
     //   }
    }
}
