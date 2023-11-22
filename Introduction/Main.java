package Introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi Rahul B");

        Student[] students = new Student[3];

        students[0] = new Student("John", 80, 92.4f);
        students[0] = new Student("Rahul", 67, 67);
        students[0] = new Student("Uzi", 98, 56.8f);

        // System.out.println(students[0].name);
        System.out.println(Arrays.toString(students));

    }
}

class Student {
    String name;
    int marks;
    float percentage;

    /**
     Student() {
     this.name = "John";
     this.marks = 80;
     this.percentage = 92.4f;
     }
    */

    Student() {
        /**
         ** This is How you call a constructor from another constructor
         ** Internally: new Student("Rahul", 89, 89.4f);
         ** here this keyword is not replaced with the name of reference
         ** variable but actually replaced with the name of the class
         */

        this("Rahul", 89, 89.4f);
    }

    Student(String name, int marks, float percentage) {
        this.name = name;
        this.marks = marks;
        this.percentage = percentage;
    }

    Student(Student other) {
        this.name = other.name;
        this.marks = other.marks;
        this.percentage = other.percentage;
    }
}