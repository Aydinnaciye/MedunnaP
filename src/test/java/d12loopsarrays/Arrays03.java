package d12loopsarrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Örnek 1: Bir int Array olusturun ve 5 ten kücük olan elemanlari yazdirin.
        // [12, 3, -3, 5, 23] ==> 3, -3

        int[] numbers = {12, 3, -3, 5, 23};
        System.out.println(Arrays.toString(numbers));//[12, 3, -3, 5, 23]

        for (int w : numbers){
            if (w<5){
                System.out.print(w + " ");//3 -3
            }
        }
        //____________________
        //Örnek2: Spesifik bir elemanin Arrayde olup olmadigini anlamak icin gereken kodu yaziniz

        //binarySearch() methodu var olan elemanlar icin size o elemanin index’ini verir
       //binarySearch() methodunu sort() kullanmadan kullanmayiniz
       //binarySearch() methodu olmayan elemanlar icin size negatif tamsayi verir
       // “-” ==> isaretinin anlami eleman yok demektir

        /* Yani, metot şu şekilde çalışır: Diziyi ikiye bölün. Aranan değer, ortadaki elemana eşitse,
         arama tamamlanır. Aranan değer, ortadaki elemandan küçükse, dizinin sol yarısında aramaya
          devam edilir. Aranan değer, ortadaki elemandan büyükse, dizinin sağ yarısında aramaya devam
          edilir. Bu işlem, aranan değer bulunana veya dizi içinde aranacak bir alt dizi kalmayana kadar
          tekrar edilir. */
        System.out.println();
        String  names[] = {"A", "T", "K", "E", "B"};
        Arrays.sort(names);                        //0   1  2  3  4. index
        System.out.println(Arrays.toString(names));//[A, B, E, K, T]

        int result = Arrays.binarySearch(names, "B");
        System.out.println(result);//1
        //________________
        int[] arr = {2, 1, 7, 6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 6, 7]
        System.out.println(Arrays.binarySearch(arr,2));//1. indexte
        System.out.println(Arrays.binarySearch(arr,7));//3
        System.out.println(Arrays.binarySearch(arr,9));//-5


    }
}
