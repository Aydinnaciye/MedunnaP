package d21oop;

public class AnimalRunner {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();//Dogs bark
        d.feedWithMilk();//Mammals feed their babies with milk...
        d.drink();//Animals drink...
        d.eat();//Dogs eat...

        Bird b = new Bird();
        b.tweet();//Birds tweet...
        //b.eat(); //Animals eat

        Cat c =new Cat();
        c.feedWithMilk();

    }
}
