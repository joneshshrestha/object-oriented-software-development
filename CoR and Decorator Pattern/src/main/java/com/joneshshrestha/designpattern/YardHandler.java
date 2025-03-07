package com.joneshshrestha.designpattern;

// Concrete YardHandler class that implements the interface Handler
public class YardHandler implements Handler{
    // variable successor of type Handler which is private
    private Handler successor;
    // KM to Yard conversion rate which is private static and final of type double
    private static final double KM_YARD_CONVERSION_RATE = 1093.61;

    // public method setSuccessor that takes in the successor of type Handler as input and assigns to the class's successor field
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    @Override
    // Implementation for the interface method handleRequest of return type String with parameters kilometer as double and targetUnit as String
    public String handleRequest(double kilometer, String targetUnit) {
        // if selected targetUnit is 'Yard', convert using th conversion rate from KM to Yard and return the value as String
        if ("Yard".equals(targetUnit)) {
            double yards = kilometer * KM_YARD_CONVERSION_RATE;
            return String.valueOf(yards);
        // if the targetUnit is not 'Yard' and a successor exists, make the other successor in the chain handle the request
        } else if (successor != null) {
            return successor.handleRequest(kilometer, targetUnit);
        }
        // if no successor is left, return unable to convert to the targetUnit
        return "Unable to convert to " + targetUnit;
    }
}

