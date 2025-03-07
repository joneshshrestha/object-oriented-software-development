package com.joneshshrestha.designpattern;

// public Concrete Decorator RoundDecorator class that extends the abstract class Decorator
public class RoundDecorator extends Decorator {
    // public constructor RoundDecorator that takes in the handler of type Handler as input and calls the superclass constructor
    public RoundDecorator(Handler handler) {
        super(handler);
    }

    @Override
    // overrides the handleRequest method inherited from the Decorator class of return type String with parameters kilometer as double and targetUnit as String
    public String handleRequest(double kilometer, String targetUnit) {
        // gets the output from the COR handler and stores as a corOutput which is of type String
        String corOutput = handler.handleRequest(kilometer, targetUnit);
        // parse the corOutput from String to double and stores as corOutputDouble
        double corOutputDouble = Double.parseDouble(corOutput);
        // return a string by rounding corOutputDouble to 2nd decimal place for further decoration
        return String.format("%.2f", corOutputDouble);
    }
}

