package Access_Modifier;

public class B {
    public B() {
        System.out.println("I am in B");
    }

    A obj = new A(5,"Nikku");
    int n = obj.num;
}
