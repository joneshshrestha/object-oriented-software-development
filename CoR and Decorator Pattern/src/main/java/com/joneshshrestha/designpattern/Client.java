package com.joneshshrestha.designpattern;

public class Client {

	//TODO Here is where you implement the converter logic using the requested "patterns" (Chain of Responsibility, and Decorator)
	//TODO You can have a static method Convert(..) here
    //TODO static Convert(...) method?
    public static String Convert(double kilometer, String targetUnit) {
        //TODO In the method body you must setup your patterns like Instantiating Handlers and setSuccessors for the Chain of Responsibility
        MileHandler mileHandler = new MileHandler();
        YardHandler yardHandler = new YardHandler();
        FootHandler footHandler = new FootHandler();

        mileHandler.setSuccessor(yardHandler);
        yardHandler.setSuccessor(footHandler);

        //TODO and Decorators for the Decorator pattern
        Handler decoratedChain = new UnitDecorator(new ExpDecorator(new RoundDecorator(mileHandler)));

        return decoratedChain.handleRequest(kilometer, targetUnit);
    }

}
