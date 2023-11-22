package StaticExample;

public class Main {
    public static void main(String[] args) {

        Human Rahul = new Human(19, "Adam", 25, false);
        Human Nikku = new Human(19, "Adam", 25, false);

        System.out.println(Rahul.population);
        System.out.println(Human.population);

        Human.greeting();

        // cannot access the non-static method using class.
//        Human.func();

    }
}