package d12loopsarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Ornek1:Int türünde ages isminde bir array olusturunuz.Icine 6 tane eleman yerlestiriniz
        //bu elemanlarin en kücügü ile en büyügünün toplamini ekrana yazdiriniz

        int[] ages = new int[6];

        ages[0] =20;
        ages[1] =23;
        ages[2] =19;
        ages[3] =44;
        ages[4] =15;
        ages[5] =32;
        System.out.println(Arrays.toString(ages));//[20, 23, 19, 44, 15, 32]

        //1.yol:
       // Arrays.sort(ages);//siralama yapar.(Ascending order).Stringlerde de alfabetik olarak siralar.
       // System.out.println(Arrays.toString(ages));//[15, 19, 20, 23, 32, 44]

        //System.out.println(ages[0] + ages[ages.length-1]);//59

        //------------------
        //2.yol:
        int minimum =ages[0];
        int maximum =ages[0];//en kücük ve en büyük olarak 0.ci indexi aldik.

        for (int w : ages){
            minimum = Math.min(minimum,w);
            maximum = Math.max(maximum,w);
        }
        System.out.println(minimum);//15
        System.out.println(maximum);//44
        System.out.println(minimum + maximum);//59



    }
}
