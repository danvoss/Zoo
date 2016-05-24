package com.mycompany;

/**
 * Created by Dan on 5/24/16.
 */
public class Animal {
    String name;

    public void makeSound() {
        System.out.println("Animal sound!");
    }

    @Override
    public String toString() {
        return name;
    }
}
