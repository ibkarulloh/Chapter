package Chapter9;

import java.util.Arrays;

public class OperasiPadaArray {
    public static void main(String[] args) {

            int [] arrayAngka1 = {1,2,3,4,5};

            //merubah array menjadi string
            System.out.println("\nMerubah array menjadi string\n======================");
            prinArray(arrayAngka1);

            //mengkopi arrays
            System.out.println("\nMengkopi array\n====================");
            int[] arrayAngka2 = new int[5];
            prinArray(arrayAngka1);
            prinArray(arrayAngka2);

            System.out.println("\nmengkopi dengan loop");
            for (int i = 0;i < arrayAngka1.length;i++){
                arrayAngka2[i] = arrayAngka1[i];
            }
            prinArray(arrayAngka1);
        System.out.println(arrayAngka1);
        prinArray(arrayAngka2);
        System.out.println(arrayAngka2);

        System.out.println("\nMengkopi dengan copiOf");
        int [] arrayAngka3 = Arrays.copyOf(arrayAngka1, 4 );
        prinArray(arrayAngka1);
        System.out.println(arrayAngka1);
        prinArray(arrayAngka3);
        System.out.println(arrayAngka3);

        System.out.println("\nMengkopi denga copiOfRange");
        int [] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 2, 5);
        prinArray(arrayAngka1);
        System.out.println(arrayAngka1);
        prinArray(arrayAngka4);
        System.out.println(arrayAngka4);

    //Fill arrays
        System.out.println("\nFill array\n====================");
        int[] arrayAngka5 = new int[20];
        prinArray(arrayAngka5);
        Arrays.fill(arrayAngka5, 7);
        prinArray(arrayAngka5);

        //Komparasi Array
        System.out.println("\nKomparasi array\n====================");
        int[] arrayAngka6 = {1,2,3,4,5,6};
        int[] arrayAngka7 = {1,2,3,4,5,6};
        System.out.println("\nMembandingkan dua buah array dengan equals");
        System.out.println(Arrays.equals(arrayAngka6,arrayAngka7));

        if (Arrays.equals(arrayAngka6,arrayAngka7)){
            System.out.println("Array ini sama");
        } else{
            System.out.println("Array ini beda");
        }
        System.out.println("\nMengecek mana array yang lebih besasr");
        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));

        System.out.println("\nMana index yang berbeda");
        System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7));

        // sort array
        System.out.println("\nsort array\n================");
        int [] arrayAngka8 = {1,8,4,6,9,3,6,7,2};
        prinArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        prinArray(arrayAngka8);
        // search array
        System.out.println("\nsearch array\n================");

        int angka = 7;
        int posisi = Arrays.binarySearch(arrayAngka8, angka);
        System.out.println("angka" + angka + " ada di index " + posisi);


        }
        private static void prinArray ( int [] dataArray){
            System.out.println("array = " + Arrays.toString(dataArray));
        }
    }

