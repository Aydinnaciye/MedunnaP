package d12loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
  /*
    1)Coklu data saklamaya izin veren yapilardir. Ornegin sinifinizdaki ogrencilerin isimleri.
    2)Array'ler tek data tipi depolayabilirler.Yani bir int dizisi sadece int değerler,
    bir String dizisi sadece String değerler saklayabilir.
    3)Array olusturmak icin i)Data Tipi ii)Data sayisi (Dizi boyutu için belirtilebilecek maksimum değer,
    Integer.MAX_VALUE (yaklaşık 2 milyar) olarak sınırlıdır) soylenmelidir.
    4)Array'ler diger Collectionlardan hizlidir çünkü boyutları sabittir
    5)Array'ler diger Collectionlardan daha az memory kullanirlar cünkü ekstra metadata veya işlevselliği yoktur.
    6)Array'ler hem primitive veri tiplerini (int, char, double vb.) hem de Object referanslarını
    (örneğin, String, Integer yani wrapper turleri gibi) saklayabilir.
*/
        //Array olusturmak

        String[]stdNames1 = new String[3];
        //String stdNames2[]= new String [4]; C style
        System.out.println(Arrays.toString(stdNames1));//Javada Arrayleri dogrudan yazdiramazsiniz.
        //[null, null, null] yazdirir.

        //__________________________
        //Örnek1: 5 elemanli notes adinda , int bir Array olusturunuz ve consola yazdiriniz

        int[]notes = new int[5];
        System.out.println(Arrays.toString(notes));

        //_______________________
        //Örnek2:10 elemanli Integers adinda ,integer bir Array olusturunuz ve konsola yazdiriniz

        Integer[]integers = new Integer[10];
        System.out.println(Arrays.toString(integers));//[null,null,null,null,null,null,null,null,null,null]

        //---------------------
        //Örnek3: 3 elemanli names adinda ,String bir Array olusturunuz ve konsola yazdiriniz
        String[]names = new String[3];
        System.out.println(Arrays.toString(names));//[null,null,null]

        //Arraya eleman eklemek
        //index mantigiyla ekleniyor.0 ilk index demektir

        names[0] = "Ali Can";
        names[1]= "Veli Han";
        names[2]= "Ayse Hanim";
        System.out.println(Arrays.toString(names));

        {

        }

    }
}



