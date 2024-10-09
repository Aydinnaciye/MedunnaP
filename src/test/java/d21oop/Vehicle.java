package d21oop;

public class Vehicle {

    /*
    Child classtan bir object olusturdugunuzda cunstructorlar en üstteki parent classtan
    baslatilarak alta dogru calisir.

*/
    //Constructor olusturalim
    public Vehicle(){
        //super();
        this("Honda", 2024, "Elektrikli");
        System.out.println("Honda, 2023, Benzin");
    }
    public Vehicle(String marka, int yil,String motor){//6
        super();//7
        System.out.println("Honda, 2024, Elektrikli");//A
        //ilk bu calisir,2. Cardaki calisir, 3.Hondadaki calisir.
    }
}
