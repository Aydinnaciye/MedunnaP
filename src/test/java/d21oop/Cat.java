package d21oop;

public class Cat extends Mammal {

    public void meow() {
        System.out.println("Cats meow...");
    }


    @Override //Annotation
    public void  feedWithMilk(){
        System.out.println("Cats feed their babies with milk...");
    }

    }


