package Access_Modifier;

public class ObjectDemo {

    public ObjectDemo() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "ObjectDemo{}";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo();
        System.out.println(obj instanceof ObjectDemo);
        System.out.println(obj.getClass().getMethods());
    }

    public static void helper(){
        System.out.println();
    }
}
