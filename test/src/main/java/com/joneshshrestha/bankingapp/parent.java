package com.joneshshrestha.bankingapp;

class Parent {
    Parent(int a, int b) {
        System.out.print("I am Parent." + a + b);
    }
}

class Child extends Parent {

    Child(int x, int y) {
        super(x, y);
        System.out.print("I am Child.");
    }
}