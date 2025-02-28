package com.joneshshrestha.designpattern;

// Concrete Product MacPushButton
// Public class MacPushButton that implements the interface AbstractPushButton
public class MacPushButton implements AbstractPushButton {
    @Override
    // Implementation for the abstract method render of return type void that prints output to console
    public void render() {
        System.out.println("Rendering a macOS push button.");
    }
}
