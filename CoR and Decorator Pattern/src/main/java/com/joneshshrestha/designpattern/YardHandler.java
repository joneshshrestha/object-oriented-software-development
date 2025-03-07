package com.joneshshrestha.designpattern;

public class YardHandler implements Handler{
    private Handler successor;
    private static final double KM_YARD_CONVERSION_RATE = 1093.61;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    @Override
    public String handleRequest(double kilometer, String targetUnit) {
        if ("Yard".equals(targetUnit)) {
            double yards = kilometer * KM_YARD_CONVERSION_RATE;
            return String.valueOf(yards);
        } else if (successor != null) {
            return successor.handleRequest(kilometer, targetUnit);
        }
        return "Unable to convert to " + targetUnit;
    }
}

