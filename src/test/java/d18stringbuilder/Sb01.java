package d18stringbuilder;

public class Sb01 {
    public static void main(String[] args) {
        /*
        1) "StringBuilder" class'da String ureten bir class'tir.
        2) String class kullanarak String üretiriz, Java nicin StringBuilder'i da olusturdu?
        *+String class "immutable" (degistirilemez) String uretir,
        **StringBuilder class "mutable"(degistirilebilir) String üretir.
        3) "immutable" olmak demek orjinal degerin korunmasi, değistirilemez olmasi demektir
         "mutable" olmak demek orjinal degerin değistirilebilir olmasi demektir
        4) Bu nedenle, metin üzerinde sık sık ekleme, çıkarma veya değişiklik yapmanız
         gereken durumlarda StringBuilder kullanmak, daha verimli ve performanslı bir seçenek olabilir.
        5)StringBuilder, metin verilerini eklemek, çıkarmak, değiştirmek veya döndürmek için çeşitli
         yöntemler ve işlevler içerir. Bunlar arasında append, delete, insert, replace gibi sık
         kullanılan yöntemler bulunur. */

        //Immutable:Degistirilemez
        String s = "Java";
        String t = s + "x";//t=Javax Heap te ayri bir alan olusur.Stringler degismez.Orjinal bozulmaz.
        String w = t + "?";//w= Javax? olur.Heap te yeni bir alan olusur .Stringler güvenlik icin degistirilemez.
        //Mesela banka adresleri ...Kimlik numaralari gibi...Runtime da degismez.

        //---------------------
        String str2 = "abc";//Bunlar String poola gider.New ´siz bütün "abc"ler ayni yerde saklanir.Daha önce
        // olusturulunca bir daha olusturulmaz.Adresleri ayni olur.Poola giderler.
        String str3 = new String("abc");//new keywordu ile olusturursak Heap te yeni bölge acilir.
        //Her new keywordu ile olusturulan ayni ögeler olsa bile onlara ayri yerler acilir.Adresleri farkli olur.
        //New hep yeni bölge olusturur.

        //---------------
        //"Ali" default olarak string kabul edilir ve dogrudan baska bir türe yüklenmez.("")String.

        //StringBuilder b = "Ali";Stringbuilder degistirilebilir.

        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1);//Python

        //Mutable:Degistirilebilir
        sb1.append("!");//append sonuna ekler.
        System.out.println(sb1);//Python!

        //Mutable yapmak icin Stringi degistirdikten sonra tekrar ayni Stringe yüklersem original deger degismez mi?
        String a ="money";
        System.out.println(a);//money

        a = a + "more";
        System.out.println(a);//money more //java pointeri siler money basibos kalir.Garbage Collector bunlari kaldirir.
        //money more u olusturur.***Garbage collector bellek sizintilarini önler.

        /*1-String'i degistirdikten sonra ayni String'e assign ederseniz Java yine yeni bir container olusturur.
        2-Degismis degeri bu yeni container'in icine koyar ve eski container'i gosteren pointer yeni container'a yonlendirilir
        3-Dolayisiyla eski container adressiz kalir ve "Garbage Collector-cop toplayici" adressiz olan container'lari siler.
        GC bellek sızıntılarını önler. GC, Java'nın birçok uygulama için güvenli ve verimli bir dil olmasını sağlayan önemli bir özelliktir.
        Veri memory'de sahipsiz ve guvenliksiz bir sekilde beklemez.
        4-GC'nin çalışma zamanlaması tamamen JVM (Java Virtual Machine) tarafından kontrol edilir ve uygulamadan bağımsızdır*/










    }
}
