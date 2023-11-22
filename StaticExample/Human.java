package StaticExample;

class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static int population;

    static void message(){
        System.out.println("Hello world");
//        System.out.println(this.name);
        /**
         * cannot use this inside a static method as
         * static methods are object independent, so
         * how can we use something that is dependent
         * on objects.
         */
    }


    public Human(int age, String name, int salary, boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;

        Human.population += 1;
    }
    static void greeting(){
        System.out.println("Greeting from Rahul B!");
        /**
         * we cannot call a non-static method func()
         * inside a static method greeting() because
         * static methods are object independent while
         * non-static methods are object independent.
         */
//        func();

    }

    void func(){
        System.out.println("I am Non-Static Method");
        greeting();
    }
}