package org.learnings4success.day1;

import java.util.Scanner;

public class Worksheet {
    public static void main(String[] args) {
//        - Statement vs Expression.
       /* int a =  2 * 2;
        int b = if(true) {
            //dosomething
            return 3;
        } else {
            return 8;
        }

        int y = for (int i = 0; i < 10; i++) {
            return i;
        }*/

//        - Procedure vs Functions.

//        - Java if..else, ternary operator, for.., while, scanner.
        /*int x = 2 * 10;
        int y = 0;
        if(x == 10) {
            // logic execute
            y = 70;
        }  else {
            // logic execute
            y = 50;
        }
        System.out.println(y);



        int z = (x == 10)? 70: 50;
        System.out.println(z);

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello folks");
        }

        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        System.out.println(a);*/
//        - Building Investment Calculator (short application with a quick touch of JavaFX).


//        - Classes and Objects (how to design the class).

        Animal a1 = new Animal("Black", "Bulldog", 2);
        Animal a2 = new Animal("Brown", "Pitbul", 10);
        System.out.println(a1.age);
        System.out.println(a1.color);
        a1.eat();;
        a1 = null;

        System.out.println(a2.type);
//        - Garbage collection.

//        - Object reference and remote.

//        - Arrays.
            int a = 10;
            int [] array = new int[10];
            Animal[] animals = new Animal[10];
        animals[0] = null;

//        - Mutable and Immutable.
//        - Maven and Junit (Quick Overview)
//        - Build Inventory app (short console application).
    }

    public void method() {
        // logic exectue
        System.out.println("Hello World");
    }

    public int method2(int q) {
        // asdad asd a
        return q * 2;
    }

}

class Animal {

    String color;
    String type;
    int age;

    public Animal(String color, String type, int age) {
        this.color = color;
        this.type = type;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void eat(){}
    void sleet(){}
}

class Remote {}
