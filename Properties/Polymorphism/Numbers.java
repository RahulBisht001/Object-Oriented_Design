package Properties.Polymorphism;

public class Numbers {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }


    public static void main(String[] args) {

        Numbers obj = new Numbers();
        System.out.println(obj.sum(2, 4));

        System.out.println(obj.sum(2, 3, 4));


    }
}