package Properties.Inheritance;

public class Box {
    private static double l;
    double h;
    double w;

    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // For Cube
    Box(double side) {
        this.h = side;
        this.l = side;
        this.w = side;
    }

    // For Cuboid
    Box(double l, double w, double h) {
        this.h = h;
        this.l = l;
        this.w = w;
    }

    Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public static void information() {
        System.out.println("Box Information" + l);
    }

}
