package d16methodcreation_overloading_varargs_passbyvalue;

public class MethodOverloading01 {
    public static void main(String[] args) {

        /* Polymorphism:
        Method Overloading (static polymorphism) + Method Overriding(dynamic polymorphism)
        OOP'nin (Object Oriented Programming-Nesne yönelimli programlama) prensiplerinin biridir.
        Polymorphism (cok bicimlilik) demektir.
         Bir method'u, istedigimiz sonuclari alacak sekilde,
         farkli farkli sekilllerde calistirabilmek icin kullanilir. */

        /*Javada method overloading (metot asiri yükleme) ,ayni class icerisinde ayni isme sahip
        ancak farkli parametre listelerine sahip birden fazla metodun tanimlanmasi islemidir.
         */

        //String s = "Java";
        //s.substring(int beginIndex); tek parametra aliyor
        //s.substring(int beginIndex, int endIndex); ==>iki parametre aliyor.

        add(3,5);
        //------------------
        //String s ="Java";
        //s.substring();substring metodu nonstatic bir metottur.Bu metot bir string objesi üzerinden cagrilir.
        //Math.min(); min metodu static bir metoddur,direk class üzerinden cagrilir.Clasa ait.

    }//main disi
    //Örnek1: Toplama islemi yapan bir metot olusturun ve sonra da overload edin
    public static void add(int a, int b){
        System.out.println(a + b);//8
    }
    public static void add(double a, double b){//Bu metodda iki tane autowiding(kücük datatype i büyük datatype cevirme) var.
        System.out.println(a + b);//
    }
    public static void add(double a, int b){//1 tane Autowiding var
        System.out.println(a + b);//Bu ikisinde 1 Autowiding var ikisinden hangini sececegini bilemez.
    }
    public static void add(int a, double b){//1 tane Autowiding var
        System.out.println(a + b);//
    }
    public static void add(int a, int b, int c){//3 parametreli oldugundan secilmez.
        System.out.println(a + b + c);//
    }
    // Method ismi + Parametre=Method Signiture(metod imzasi)
    //Method Signature ,bizim imzamiz gibi benzersiz olmalidir.

    /* Method Overloading'de sadece parametreler degistirilir.
    Boylelikle method signature degismis olur ve Java bu methodu yeni bir method gibi kabul eder.
     Method Overloading icin;
     a) Parametre sayisini degistirebilirsiniz.
     b) Parametre data tiplerini degistirebilirsiniz.
     c) Parametre data tipleri farkli ise parametrelerin yerlerini degistirebilirsiniz.
     d) Method overloading olustururken return type'in, access modifier'in(public,privat,protected),
     static veya non-static olmanin hicbir etkisi yoktur. */


    /* Soru 1: private method'lar overload edilebilir mi?
    Cevap 1: private method'lar overload edilebilirler
    cunku; overload islemi tek class icinde yapilir,
    private methodlar ayni class'in icinden ulasilabilir oldugundan overload'a engel degildir.
     Soru 2: static method'lar overload edilebilir mi?
     Cevap 2: static method'lar overload edilebilir cunku esasinda overload'da biz
     yeni method'lar olustururuz. */

}
