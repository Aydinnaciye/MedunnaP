package d19stringbuilder_buffer_accessmodifier_static;

public class StaticBlock {

        /*static block,bir classin yüklenmesi sirasinda otomatik olarak calisan ve klasinbaslatilmasini veya
        baslangic ayarlarini yapmayai saglayan bir özelliktir..Statik block yanlizca bir kez calistirilir.

        Bu bloklar örnegin, veri tabani baglantilari icin kullanilir.
        Bu, uygulamanin herhangi bir bölümünda veritabanina erisim gerektiginde baglantinin hizli bir sekilde
        hazir olmasini saglar.
         */

        static double pi;

        static { //static block
            //static bloklar icinda e yerel degiskenler tanimlanamaz ama deger atanir.
            pi = 3.14;
            System.out.println("Static block 1");//static block 1
            //her zaman static block önce calisir.
        }
    public static void main(String[] args) {
        System.out.println(pi);//3.14
        System.out.println("main method ici");//main method ici



    }
}
