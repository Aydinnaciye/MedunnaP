package Practise;

import java.util.Scanner;

public class C03_ForLoop {
    public static void main(String[] args) {
        //Kullanicidan 10 dan kücük bir tam sayi isteyin ve girilen sayinin faktoryelini bulun.
        // 10 dan kücük byte kullanalim -128 ile 127 rasi
        Scanner input =new Scanner(System.in);

        System.out.println("Lütfen 10 dan kücük bir tam sayi giriniz");
        byte sayi =input.nextByte();
        int carpim=1;
        if (sayi<0 ||sayi>10){
            System.out.println("Lütfen gecerli bir sayi giriniz");
        }else{
            for (int i=sayi; i>1; i--){
                carpim*=i;
                System.out.println(carpim);//720
            }
        }

    }
}
