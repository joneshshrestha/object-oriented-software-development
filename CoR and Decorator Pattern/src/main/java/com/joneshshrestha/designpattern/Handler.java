package com.joneshshrestha.designpattern;

// Handler interface for CoR Design Pattern
// Interface for Handler with abstract method handleRequest
public interface Handler {
    // Abstract method handleRequest of type String with parameters kilometer as double and targetUnit as String
    String handleRequest(double kilometer, String targetUnit);
}

