package Practise;

import javax.swing.*;

public class C02_ForLoop {
    public static void main(String[] args) {


        //Soru1-Belirlenen sayinin 1 den 10 a kadar carpim sonuclarini yazan java programini yaziniz.

        int sayi = 6;

       // for (int i = 1; i < 11; i++) {
       //     System.out.println(i + "*" + sayi + "=" + i * sayi);

       // }
//____________________
        //Lütfen 10x10 luk bir carpim tablosu olusturalim
        for (int i =1; i<=10; i++){
            for (int j =1;j<=10; j++){
                System.out.print(i+"*"+j+"="+i*j+"   | ");
            }
            System.out.println();
        }
    }
}