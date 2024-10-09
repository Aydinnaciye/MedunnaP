package d21oop;

public class Honda  extends Car{

    public  String model = "Civic";
    public  int year = 2023;
    public  Honda(){
       // super();//bunu this yaparsak hem civic hem de Accordu ayni anda üretebiliriz.
        System.out.println("super.model ="+super.model);
        System.out.println("this.year ="+ this.year);
        System.out.println("Civic");
    }
    public Honda(String model){ //Accordu kabul edecek bir Constuctor olusturduk.//2
      //super("Sport");//3
        super();//Sedani yani parametresizi secsindiye superin icini bos yazdik
        System.out.println("Accord");//C
    }
}
