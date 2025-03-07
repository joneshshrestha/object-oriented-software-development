package com.joneshshrestha.designpattern;


public abstract class Decorator implements Handler {
    protected Handler handler;
    
    public Decorator(Handler handler) {
        this.handler = handler;
    }
}


