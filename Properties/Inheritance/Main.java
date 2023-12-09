package Properties.Inheritance;

public class Main {
    public static void main(String[] args) {

        // zero argument constructor
//        Box box = new Box();

        // one argument
//        Box box1 = new Box(4);

        // Passing another Object
//        Box box2 = new Box(box1);

//        box.information();
//        System.out.println(box1.l + " " + box1.w + " " + box1.h);

//        System.out.println(box2.l + " " + box2.w + " " + box2.h);

//        BoxWeight box4 = new BoxWeight(2, 3, 4, 6);
//        System.out.println(box4.l + " " + box4.w);
//        BoxWeight.information();


        // It's Okk
        Box box5 = new BoxWeight(2, 3, 4, 8);
        System.out.println(box5.w);
//        System.out.println(box5.weight); Error

        // But This will Give Error
//        BoxWeight box6 = new Box(3,4,5);
//        System.out.println(box6.w);

    }
}
