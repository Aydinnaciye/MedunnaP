package Practise;

public class C04_ForLoop {
    public static void main(String[] args) {
       //Döngü sayisi belli ise for loop seciyoruz.
       //En az bir kez calismasi gerekiyorsa do while,degilse while kullanilir.

        /*
        * * * * .
        * * * . .
        * * . . .
        * . . . .
        . . . . .

         */

        int satir = 5;
        for (int bulunSatir = 1; bulunSatir <= satir; bulunSatir++) {
            for (int yildiz = satir - bulunSatir; yildiz > 0; yildiz--) {
                System.out.print("* ");
            }
            for (int nokta = bulunSatir; nokta > 0; nokta--) {
                System.out.print(". ");

            }
            System.out.println();
        }
        //ÖDEV:
        /*    *
             * *
            *****
          *       *
        *           *

         */
    }
}