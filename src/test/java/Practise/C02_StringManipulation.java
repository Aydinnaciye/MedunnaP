package Practise;

public class C02_StringManipulation {
    public static void main(String[] args) {
        //Bir string debenzersiz(tekrarsiz)karakterler yazdirmak icin kod yaziniz.

        String str = "class ismini atar misiniz hocam";
        String bosStr ="";
        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                  bosStr+=str.charAt(i);
            }
        }
        System.out.println("sonuc : "+bosStr);//ltrzho
    }
}