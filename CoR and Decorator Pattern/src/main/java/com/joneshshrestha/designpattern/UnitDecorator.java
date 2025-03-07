package com.joneshshrestha.designpattern;

public class UnitDecorator extends Decorator {
    public UnitDecorator(Handler handler) {
        super(handler);
    }

    @Override
    public String handleRequest(double kilometer, String targetUnit) {
        String corOutput = handler.handleRequest(kilometer, targetUnit);

        return corOutput + ' ' + targetUnit;
    }
}
