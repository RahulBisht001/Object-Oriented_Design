package Other;

import Access_Modifier.A;
import Access_Modifier.B;

public class ChildSubclass extends Subclass {

    public ChildSubclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        ChildSubclass obj = new ChildSubclass(4, "RB");
        System.out.println(obj.name);

        System.out.println(obj instanceof A);
//        System.out.println(obj instanceof B);

    }
}
