package Singleton;

public class Singleton {
    private Singleton(){
       // instance variable and methods
    }
    private static Singleton instance;
    public static Singleton getInstance(){
        /**
         * if instance is null, then create a new one else return the old one.
         * check whether one object is created or not.
         */

        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
