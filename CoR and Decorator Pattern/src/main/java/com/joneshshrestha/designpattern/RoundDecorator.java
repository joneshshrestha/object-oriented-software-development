package com.joneshshrestha.designpattern;

public class RoundDecorator extends Decorator{
    public RoundDecorator(Handler handler) {
        super(handler);
    }

    @Override
    public String handleRequest(double kilometer, String targetUnit) {
        String corOutput = handler.handleRequest(kilometer, targetUnit);

        double corOutput_double = Double.parseDouble(corOutput);
        return String.format("%.2f", corOutput_double);
    }
}

