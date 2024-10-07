package d19stringbuilder_buffer_accessmodifier_static;

public class StudentRunner {
    public static void main(String[] args) {
        //Student classtan bir örnek (instance)olusturalim
        Student ali =new Student();

        System.out.println("ali.stdName ="+ali.stdName);//Ali Can

        System.out.println("ali.email ="+ ali.email);//alican@gmail.com

        System.out.println("ali.address ="+ ali.address);//

        System.out.println(ali);//Student{stdName='Ali Can', address='Istanbul', email='alican@gmail.com', tcKimlik='1234567891'}
    }
}
