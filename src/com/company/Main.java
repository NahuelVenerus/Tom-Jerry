package com.company;

public class Main {

    public static void main(String[] args) {

    Tom tom  = new Tom(30);
        System.out.println(tom);
        tom.run(10);
        System.out.println(tom);
        Mouse Jerry = new Mouse(30);
        tom.eat(Jerry);
        System.out.println(tom);
    }
}
