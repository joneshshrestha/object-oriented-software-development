package com.joneshshrestha.designpattern;

public class ExpDecorator extends Decorator {
    public ExpDecorator(Handler handler) {
        super(handler);
    }

    @Override
    public String handleRequest(double kilometer, String targetUnit) {
        String corOutput = handler.handleRequest(kilometer, targetUnit);

        double corOutput_double = Double.parseDouble(corOutput);
        return String.format("%.4E", corOutput_double);
    }
}

