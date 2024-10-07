package Practise;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
    //ternary->kac defa dönecegi belli mi ? for : (en az bi rkere calismasi gerekli mi ? do-while : while);
    //while ile cözülen sorularin bir cogu do-while ile de cözülebilir.Fakat güvenlik acigi olabilir.
        //Kullanici istedigi kadar pozitif sayi girmesini isteyin
        //kullanicinin girdigi sayinin toplami 500 ü gecerse
        //artik yeter cok sayi girdin.toplam ...oldu yazsin.
        Scanner input = new Scanner(System.in);

        int toplam=0;
        while (toplam<500){
            System.out.println("Lütfen toplamak istediginiz sayilari giriniz");
            int sayi = input.nextInt();
            toplam+=sayi;
        }
        System.out.println("Artik yeter cok sayi girdin,toplam "+toplam+ "oldu");
    }
    // bilgisayara 1 ile 100 arasinda bir sayi tutturun
    // kullanicidan bu sayiyi tahmin etmesini isteyin
    // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
    // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
    // Random rnd=new Random();
    // int sayi=rnd.nextInt(100);
    // burasi 100'den kucuk rastgele bir sayi olusturur
    // odev!!!kullaniciya 5 tahmin hakkı verin bulursa tebrik edin bulamazsa exit
    // atip tekrar oynamasini isteyin

}
