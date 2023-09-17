package org.learnings4success.day2;

import java.util.ArrayList;

public class Worksheet {
    public static void main(String[] args) {
        // Finalise
//        TestFinalize a = new TestFinalize();
//        a = null;
//        System.gc();
//        try {
//            Thread.sleep(100000l);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


        // stack
//        Worksheet w = new Worksheet();
//        w.methodA();

        //- Mutable and Immutable.
//        final int a = 10;
//        a = (a > 20)? 30 : 1;

        /*final int c = 10;
        new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }.start();

        System.*//**//*out.println(Thread.currentThread().getName());*/

/*
        final var testFinalise = new TestFinalize();

        testFinalise.a = 30;

        System.out.println(testFinalise.a);

        testFinalise = new TestFinalize();
*/

        //- Maven and Junit (Quick Overview)
        //- Build an Inventory app (short console application).
        //- Array vs. ArrayList.
        // - Haterogenous
        // - size define
        // [0] = // write
        // [0] // read
        // int [] a = new int[10];
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Add element in array lsit: " + list.add(2));
        System.out.println("Get element from list : "+  list.get(0));
        System.out.println("List contains element : "+  list.contains(2));
        System.out.println("List contains element : "+  list.contains(3));
        System.out.println("Which element removed from list: " + list.remove(0));
        System.out.println("List contains element : "+  list.contains(2));


        //- Refactor the Inventory app using ArrayList.
        //- Java packages and API docs.
        //- Autoboxing and Unboxing.
        //- Inheritance and Polymorphism.
        //- Equals and Hashcode contract.
    }

//    public void methodA() {
//        methodB();
//    }
//    public void methodB() {
//        int a = 0;
//        methodC();
//    }
//    public void methodC() {}

}

class TestFinalize {
    int a = 10;
    @Override
    protected void finalize() throws Throwable {
        System.out.println("hello Garbage collector");
    }
}
