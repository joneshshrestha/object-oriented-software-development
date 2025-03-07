package com.joneshshrestha.designpattern;

// public Concrete Decorator UnitDecorator class that extends the abstract class Decorator
public class UnitDecorator extends Decorator {
    // public constructor UnitDecorator that takes in the handler of type Handler as input and calls the superclass constructor
    public UnitDecorator(Handler handler) {
        super(handler);
    }

    @Override
    // overrides the handleRequest method inherited from the Decorator class of return type String with parameters kilometer as double and targetUnit as String
    public String handleRequest(double kilometer, String targetUnit) {
        // gets the output from the COR handler and stores as a corOutput which is of type String
        String corOutput = handler.handleRequest(kilometer, targetUnit);
        // return a string by adding unit name to the converted amount corOutput with a whitespace in between
        return corOutput + ' ' + targetUnit;
    }
}
