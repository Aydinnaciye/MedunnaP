package Practise;

import java.util.Scanner;

public class C01_Switch {
    public static void main(String[] args) {
        //Toplama, Çıkarma, Çarpma, Bölme , kalan Hesaplama ve us alma
        // 2 sayi işlem yapan basit bir Hesap Makinesi oluşturun:
        // 1.adım
        Scanner input = new Scanner(System.in);
        // 2. adım
        System.out.println("Lütfen işlem yapmak istediginiz operatoru giriniz : " +
                "\ntoplamak icin : +" +//++
                "\ncıkarmak icin : -" +
                "\nbolmek icin : /" +
                "\ncarpmak icin : *" +
                "\nmodulus icin : %" +
                "\nus almak icin : ^");
        // 3. adım uygun bir variable'a atamak
        char operator = input.next().charAt(0);
        // 4.adım olarak ne yapıcaz? // kontrol yapıcaz fakat neden
        switch (operator) {
            case '+':
                System.out.println("Lütfen toplamak istediginiz 2 sayiyi giriniz");
                System.out.println("sayiların toplami : " + (input.nextDouble() + input.nextDouble()));
                break;
            case '-':
                System.out.println("Lütfen farkını almak istediginiz 2 sayiyi giriniz");
                System.out.println("Sayiların farki : " + (input.nextDouble() - input.nextDouble()));
                break;
            case '*':
                System.out.println("Lütfen çarpmak istediginiz 2 sayiyi giriniz");
                System.out.println("Sayiların carpimi : " + input.nextDouble() * input.nextDouble());
                break;
            case '/':
                System.out.println("Lütfen bolmek istediginiz 2 sayiyi giriniz");
                double sayi1 = input.nextDouble();
                double sayi2 = input.nextDouble();
                if (sayi2 == 0) {
                    System.out.println("sonsuz");
                } else {
                    System.out.println("Sayilarin bölümü :" + sayi1 / sayi2);
                }

                // odev paydanin 0 olmasi durumunu kontrol altına alınız
                break;

            case '%':
                System.out.println("Lütfen birbirine bolumunden kalanı hesaplamak istediginiz 2 sayiyi giriniz");
                System.out.println("Modu : " + input.nextDouble() % input.nextDouble());//aynı sekilde 2. sayının 0 olma durumunu kontrol ediniz
                break;

            case '^':
                System.out.println("Lütfen kuvvetini almak istediginiz sayilari giriniz : ");
                sayi1 = input.nextDouble();//taban
                sayi2 = input.nextDouble();//kuvvet
                System.out.println("Kuvvetleri : " + Math.pow(input.nextDouble(), input.nextDouble()));
                // bu for dongusu ile'de yapılabilir size odev!!!
                break;
            default:
                System.out.println("Lütfen geçerli bir operator giriniz ☺");
                break;

        }


    }

}