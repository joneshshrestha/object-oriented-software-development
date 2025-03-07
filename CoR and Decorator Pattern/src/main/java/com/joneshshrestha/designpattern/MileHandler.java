package com.joneshshrestha.designpattern;

public class MileHandler implements Handler {
    private Handler successor;
    private static final double KM_MILE_CONVERSION_RATE = 0.621371;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    @Override
    public String handleRequest(double kilometer, String targetUnit) {
        if ("Mile".equals(targetUnit)) {
            double miles = kilometer * KM_MILE_CONVERSION_RATE;
            return String.valueOf(miles);
        } else if (successor != null) {
            return successor.handleRequest(kilometer, targetUnit);
        }
        return "Unable to convert to " + targetUnit;
    }
}

