package com.joneshshrestha.designpattern;

// Decorator abstract class for Decorator Design Pattern that implements the Handler functionality
// public abstract class Decorator that implements Handler interface from COR
public abstract class Decorator implements Handler {
    // variable handler of type Handler which is protected
    protected Handler handler;

    // public constructor Decorator that takes in the handler of type Handler as input and assigns to the class's handler field
    public Decorator(Handler handler) {
        this.handler = handler;
    }
}


