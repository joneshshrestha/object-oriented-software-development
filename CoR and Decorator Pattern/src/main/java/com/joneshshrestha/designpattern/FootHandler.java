package com.joneshshrestha.designpattern;

public class FootHandler implements Handler{
    private Handler successor;
    private static final double KM_FOOT_CONVERSION_RATE = 3280.84;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    @Override
    public String handleRequest(double kilometer, String targetUnit) {
        if ("Foot".equals(targetUnit)) {
            double feet = kilometer * KM_FOOT_CONVERSION_RATE;
            return String.valueOf(feet);
        } else if (successor != null) {
            return successor.handleRequest(kilometer, targetUnit);
        }
        return "Unable to convert to " + targetUnit;
    }
}

