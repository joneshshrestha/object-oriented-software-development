package com.joneshshrestha.designpattern;

// Concrete FootHandler class that implements the interface Handler
public class FootHandler implements Handler{
    // variable successor of type Handler which is private
    private Handler successor;
    // KM to foot conversion rate which is private static and final of type double
    private static final double KM_FOOT_CONVERSION_RATE = 3280.84;

    // public method setSuccessor that takes in the successor of type Handler as input and assigns to the class's successor field
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    @Override
    // Implementation for the interface method handleRequest of return type String with parameters kilometer as double and targetUnit as String
    public String handleRequest(double kilometer, String targetUnit) {
        // if selected targetUnit is 'Foot', convert using th conversion rate from KM to Foot and return the value as String
        if ("Foot".equals(targetUnit)) {
            double feet = kilometer * KM_FOOT_CONVERSION_RATE;
            return String.valueOf(feet);
        // if the targetUnit is not 'Foot' and a successor exists, make the other successor in the chain handle the request
        } else if (successor != null) {
            return successor.handleRequest(kilometer, targetUnit);
        }
        // if no successor is left, return unable to convert to the targetUnit
        return "Unable to convert to " + targetUnit;
    }
}

