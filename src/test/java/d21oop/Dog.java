package d21oop;

public class Dog extends Mammal {

    public void bark() {
        System.out.println("Dogs bark...");
    }

    @Override //Annotation
    public void eat() {
        System.out.println("Dogs eat...");
    }

    @Override
    public Animal create() {//her class ismi o clasin data tipidir.
        return new Dog();//Upcastig(yukari dogru gitmek parente)Ust classa dönüsür.
        //Dog classtan bir obje urettik ve disari
        //Animal data tipiyle return ettik.
    }
    @Override
    public int add(int a, int b){
        return  a + b;
        //primitive data tipleri arasinda parent child iliskisi yoktur.
        //primitivelerde return type degistirilemez.
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }
}