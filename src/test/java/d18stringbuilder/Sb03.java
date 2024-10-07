package d18stringbuilder;

public class Sb03 {
    public static void main(String[] args) {
        //1-reverse():StringBuilder Objectin icerigini ters cevirir.

        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);//Java is easy

        sb1.reverse();
        System.out.println(sb1);//ysae si avaJ

        //2-deleteCharAt(int index): Belirtilen konumda (index'te )bulunan karakteri siler.
        sb1.deleteCharAt(1);
        System.out.println(sb1);//yae si avaJ

        //-------------------
        //3-delete(int start-dahil ,int end -haric) Belirtilen araliktaki karakterleri siler.
        sb1.delete(0,2);
        System.out.println(sb1);//e si avaJ

        //-----------
        //4-replace(int start-dahil ,int end -haric, String str)Belirtilen indeyteki karakterleri verilen stringle degistirir.
        sb1.replace(0,2,"Hasan");
        System.out.println(sb1);//Hasansi avaJ

        //-------------
        //5-insert(int offset, String str)belirtilen konumdan itibaren verilen stringi ekler.
        //Offset eklemenin baslayacagi konumu belirtir.
        sb1.insert(2,"34");
        System.out.println(sb1);//Ha34sansi avaJ
    }
}
