package StaticExample;

/**
class Test {
    static String name;
    public Test (String name){
        Test.name = name;
    }
}
*/

public class InnerClass {

    static class Test {
        String name;
        public Test (String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {

        Test A = new Test("Rahul");
        Test B = new Test("Nikku");

        System.out.println(A.name);
        System.out.println(B.name);

    }
}
