package com.mycompany;

public class Main {

    public static void main(String[] args) {
        Dog d = new Dog();
        Snake s = new Snake();
        Hawk h = new Hawk();

        d.makeSound();
        s.makeSound();
        h.makeSound();

        System.out.println(d);
        System.out.println(s);
        System.out.println(h);

    }
}
