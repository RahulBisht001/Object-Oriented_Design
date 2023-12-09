package Properties.Polymorphism;

public class Circle extends Shapes {

    /**
     * This will run when an Object of Parent class is created,
     * hence it is Overriding the parent method.
     *
     * @Override this is called Annotation
     */
    @Override
    void area() {
        System.out.println("Area is : pie * r * r");
    }
}
