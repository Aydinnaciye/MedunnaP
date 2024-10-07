package d19stringbuilder_buffer_accessmodifier_static;

public class Student2 {

    //static, bir degiskenin veya bir metodun clasa ait oldugunu ve classin bir örnegi (objecti)
    //olusturulmadan kullanilabilecegini belirtmek icin kullanilan bir anahtar kelimedir.

    String s = "Java kolaydir";
    //s.subString(0,3); ==> non static //Jav
    //String.subString();

   //Math.min() ==> static
    //static variable herkes icin ortaktir pi sayisi gibi 3,14.
    //final ile etiketlenen variablelar degismez.
    // Static variabllar degisebilir.Burdaki degisken bütün objeleri etkiler.

    /* 1) static variable veya static methodlar (class member) tum object'ler icin ortak elemandir
    2) static class member'lar uzerinde yapilan degisiklikler tum objectleri etkiler.
    3) static class member'lar class'a, non-static class member'lar object'lere aittir
    4) static class member'lara ulasmak icin object olusturmaya gerek duyulmaz,
    ama non-static class member'lara ulasmak icin object olusturmak sarttir
    5) static variable'larin diger adi class variable'dir,
    non-static variable'larin diger adi instance variable veya object variable'dir */

    public static String stdName = "Ali Can";//static variable
    public  int age = 18; //non-static variable
    public static void statisMethod(){
        System.out.println("Ben static bir methodum");
    }
    public void  nonStaticMethod(){
        System.out.println("Ben non-static bir methodum");
    }




}
