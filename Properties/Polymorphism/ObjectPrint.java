package Properties.Polymorphism;

public class ObjectPrint {
    @Override
    public String toString() {
        return "RahulB is the Best";
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint();
        System.out.println(obj);
    }
}
