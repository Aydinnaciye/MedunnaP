package d16methodcreation_overloading_varargs_passbyvalue;

public class MethodCreation02 {
    public static void main(String[] args) {

        int result1 = multiply(3,5);//metotun cagrildigi yer burasi
        System.out.println(result1);//15
        //_______________
        int result2 =firstTwoMultiplyThirdAdd(4, 4, 2);
        System.out.println(result2);
        //________________
        print("Ali Can");//data tipi kullanilmaz.

    }//method disi

    //____________________-
    //Örnek:Iki sayiyi carpan bir metot olusturunuz
    //protected:Bu clastan ve miras alinan classlardan erisilebilir.
    protected static int multiply(int a, int b){//burasi multply metodu,süslü parantez kapanana kadar.
        return  a * b;
    }
    //________________________
    //Örnek2: Verilen 3 sayidan ilk ikisini carpan ve sonucu 3. sayi ile toplayan metot olusturunuz.

    private static int firstTwoMultiplyThirdAdd(int a, int b, int c){
        return  a * b + c;
    }
    //__________
    //Örnek 3: Girilen bir kelimeyi konsola yazdiran bir metot olusturunuz(void yani return yok)
    public static void  print(String str){
        System.out.println(str);//Ali Can
        //Eger bir metot yeni bir data üretmiyor ise return typi void olur.Void ise return yazilmaz

    }

}
