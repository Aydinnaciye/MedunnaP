package Practise;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
        //Kullanicidan toplamak istedigi sayilari aliniz
        //Kullanici 0 a basincaya kadar devam edin
        //Kullanici 0 a basinca döngü sonlanacak
        //Girdigi tüm sayilarin toplamini yazdirin
        Scanner input= new Scanner(System.in);
        int sayi;
        int toplam=0;
        do {
            System.out.println("Lütfen toplamak istediginiz sayilari giriniz");
            sayi=input.nextInt();
            toplam+=sayi;
        }while (sayi!=0);
        System.out.println("toplam ="+ toplam);
    }
}
