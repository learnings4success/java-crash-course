package org.learnings4success.day3;

import java.util.*;

public class Worksheet {
    // assert
    public static void main(String[] args) {
//        int c = 11;
//        assert c > 10 : "Success";
//        System.out.println("The value is"+ c);

        //- Java packages and API docs.

        //- Autoboxing and Unboxing.
        /*int a = 10;

        Integer ddd = Integer.valueOf(1000);
        int ccc = ddd.intValue();


        Integer b = Integer.valueOf(10);
        int dd = b.intValue();

        var list = new ArrayList<Integer>();
        list.add(10);
        list.add(12);
        list.add(34);
        int ads = list.get(1);*/


        //- Inheritance and Polymorphism.

//        Animal animal = new Animal();
//        animal.eat();
//        animal.sleep();
//
//        Animal animal1 = new Dog();
//        Animal animal2 = new Cat();
//        Animal animal3 = new Tiger();

//        callCommonBehaviours(animal1);
//        callCommonBehaviours(animal2);
//        callCommonBehaviours(animal3);

        //- Equals and Hashcode contract.

        Dog dog1 = new Dog(1, 2);
        Dog dog2 = new Dog(1, 2);
        Dog dog4 = new Dog(1, 2);
        Dog dog5 = new Dog(1, 2);
        Dog dog6 = new Dog(1, 2);
        Dog dog3 = new Dog(2, 4);

        System.out.println(dog1.hashCode());
        System.out.println(dog2.hashCode());
        System.out.println(dog3.hashCode());

        System.out.println(dog1.equals(dog2));

        //- Set and Map.
        HashSet<Dog> dogSet = new HashSet<>();
        dogSet.add(dog1);
        dogSet.add(dog2);
        dogSet.add(dog3);
        dogSet.add(dog4);
        dogSet.add(dog5);
        dogSet.add(dog6);

        System.out.println(dogSet.size());

        Map<Integer, Dog> map = new HashMap<>();
        map.put(dog2.number, dog2);
        map.put(dog1.number, dog1);

        System.out.println(map.get(1));
        //- Exception Handling.
        //- Optional
    }

    public static void callCommonBehaviours(Animal animal) {
        animal.sleep();
        animal.eat();
        if(animal instanceof Dog dog) {
            dog.bark();
        } else if(animal instanceof Tiger tiger){
            tiger.raor();
        }
        else {
            Cat cat = (Cat) animal;
            cat.meaow();
        }

    }
    public void defineAnimalBehaviour(Dog dog) {
        // eat
        dog.eat();
        // sleep
        dog.sleep();
    }

    public void defineAnimalBehaviour(Cat cat) {
        // eat
        cat.eat();
        // sleep
        cat.sleep();
    }
}

class Animal {
    public void eat(){}
    public void sleep(){}
}

class Dog extends Animal{

    int age;
    int number;

    public Dog(int number, int age){
        this.number = number;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("Dog Eat");
    }

    @Override
    public void sleep() {
        System.out.println("Dog Sleep");
    }

    public void bark(){
        System.out.println("Dogs bark.... ");
    }

    public int getAge() {
        return age;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int hashCode() {
        return this.number;
    }

    @Override
    public boolean equals(Object obj) {
        var dog = (Dog) obj;
        return this.number == dog.getNumber();
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat Eat");
    }

    @Override
    public void sleep() {
        System.out.println("Cat Sleep");
    }

    public void meaow(){
        System.out.println("Cat's meaow ... ");
    }
}

class Tiger extends Animal{
    @Override
    public void sleep() {
        System.out.println("Tiger sleep");
    }

    @Override
    public void eat() {
        System.out.println("Tiger Eat");
    }

    public void raor(){
        System.out.println("Tiger Roar ... ");
    }
}
