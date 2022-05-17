package com.profacilis;

import com.profacilis.types.*;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        information();
    }

    private static Animal getRightAnimal(Type type) {
        Animal animal;
        switch (type) {
            case CAT -> animal = new Cat();
            case BIRD -> animal = new Bird();
            case FISH -> animal = new Fish();
            case SPIDER -> animal = new Spider();
            case SNAKE -> animal = new Snake();
            case WASP -> animal = new Wasp();

            default -> animal = null;
        }
        return animal;
    }

    static void information() {



        boolean flag = true;

        do {

            String what = getString();

            if (!what.equals("bye")) {

                Type type = Type.valueOf(what.toUpperCase(Locale.ROOT));
                Animal animal = getRightAnimal(type);

                if (animal == null) {

                    System.out.println("Maybe you know such an animal, I don't");

                } else if (animal != null){

                    System.out.printf("This animal has %s legs and %s%n %s%n", animal.getNumberOfLegs(),
                            animal.isHasTail() ? "has a tail" : "has no tail",
                            animal.getType().isNice() ? "is nice" : "isn't nice");
                    System.out.printf("It can swim ? %s", movable(animal));}


            } else {

                flag = false;
                System.out.println("Goodbye!");}

        } while (flag);


    }

    static String movable(Animal animal) {

        Movable movable = () -> {
            return animal.canSwim();
        };

        return movable.canSwim() ? "YES" : "NO";
    }











    static String getString() {

        return new Scanner(System.in).nextLine();
    }





}