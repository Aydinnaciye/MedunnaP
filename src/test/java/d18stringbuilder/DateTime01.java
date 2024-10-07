package d18stringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class DateTime01 {
    public static void main(String[] args) {
        /*LocalTime Class'ta kullanilan tarih saat formatlari
        HH : mm ==> 24'lu saat sistemi
        hh : mm ==> 12'li saat sistemi. AM, PM gosterilmez
        hh : mm a ==> 12'li saat sistemi. AM, PM gosterilir
        HH : mm : ss ==> saniyeyi gosterir
        HH : MM ==> yanlis format cunku MM aylar icin kullanilir
        "mm" "minute" demektir.
        "MM" "month" demektir.
        dd-MM-yyyy ==> gun - ay - yil
        MMM ==> Aug
        MMMM ==> August */

        //-------------
        // ornek 1:"DateTimeFormatter", bir Class'tir ve tarih ve saat verilerini belirli bir
        // biçimde görüntülemek, okumak ve işlemek için kullanılan önemli bir araçtır.
        // DateTimeFormatter, tarih ve saat nesnelerini "metin" yani String olarak biçimlendirmenize ve
        // metni tarih ve saat nesnelerine çözmenize olanak tanır.
        // ofPattern() metodu, belirli bir kalıba (pattern) göre tarih ve zaman verilerini
        // biçimlendirmek için kullanılır.
        // format() method'u LocalTime'i String'e istedigimiz formatta cevirir

        LocalTime myCurrentTime = LocalTime.now();
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm a");//pattern(model)
        String formattedTime = dtf1.format(myCurrentTime);

        System.out.println(formattedTime);//07:46 ÖS
        //__________________

        //Örnek2:Tarihi formatlayalim
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);//2024-10-04

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String formattedDate = dtf2.format(myCurrentDate);

        System.out.println(formattedDate);//04-Eki-2024

        //______________________
        //Örnek3: Baska bir zaman dilimindeki tarih ve zamani nasil aliriz
        //ZoneId zaman dilimi veya cografi bölge bilgisini temsil eder ve
        //tarih/saat islemlerinde bu bilginin kullanilmasini saglar

        //Tokyo da ayin kaci
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);//2024-10-05

        //Amsterdam da ayin kaci
        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);//2024-10-04

        //Tokyo da saat kac
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);//03:07:53.856553

        //https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html

        //Tüm zoneleri görelim

        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        for (String w : zoneIds){
            System.out.println(w);
        }

        //Zaman dilimlerinin sayisini yazdiralim
        System.out.println("Toplam zaman dilimi sayisi : "+ zoneIds.size());//601

        //________________
        //Örnek4:Tarih ve zamani ayni anda kullanma
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);//2024-10-04T20:18:34.304718

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd * MMM * yyyy - hh : mm a");
        String formattedLdt = dtf3.format(ldt);
        System.out.println(formattedLdt);//04 * Eki * 2024 - 08 : 22 ÖS
    }
}
