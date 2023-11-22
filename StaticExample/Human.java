package StaticExample;

class Human {
    int age;
    String name;
    static int salary;
    static boolean married;

    public Human(int age, String name, int salary, boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
    }
}