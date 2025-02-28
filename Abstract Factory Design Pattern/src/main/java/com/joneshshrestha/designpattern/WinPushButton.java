package com.joneshshrestha.designpattern;

// Concrete Product WinPushButton
// Public class WinPushButton that implements the interface AbstractPushButton
public class WinPushButton implements AbstractPushButton {
    @Override
    // Implementation for the abstract method render of return type void that prints output to console
    public void render() {
        System.out.println("Rendering a Windows push button.");
    }
}
