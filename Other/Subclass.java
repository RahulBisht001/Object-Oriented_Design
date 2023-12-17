package Other;

import Access_Modifier.A;

public class Subclass extends A {

    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(3, "Jyo");
        System.out.println(obj.name);
    }

}
