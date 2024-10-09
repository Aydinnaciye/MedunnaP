package d21oop;

public class Car extends Vehicle{

    public  String model = "Accord";
    public  int year = 2024;

    public Car(){
        //super();
        this("Sport");//this kendi sinifi icinde arar.
        System.out.println("Sedan");
    }
    public Car(String tip){//4
        //super("Honda", 2024, "Elektrikli");//5
        super();//super parent klassa yapilir
        System.out.println("Sport");//B

    }
}
