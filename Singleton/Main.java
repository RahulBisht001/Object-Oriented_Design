package Singleton;

public class Main {
    public static void main(String[] args) {

        System.out.println("Singleton Class");

        Singleton obj  = Singleton.getInstance();

        Singleton obj1  = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();
    }
}
