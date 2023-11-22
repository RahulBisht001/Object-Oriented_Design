package StaticExample;

public class StaticBlock {
    static int a = 4;
    static int b;

    static {
        b = a * 5;
        System.out.println("I am in Static Block");
    }
    public static void main(String[] args) {

        System.out.println("Hi Rahul");
        System.out.println(a +" " + b);
    }
}
